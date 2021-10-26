package com.epam.jwd.task02.dao.parser.impl;

import com.epam.jwd.task02.dao.parser.ApplianceParser;
import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.dao.parser.XmlParserException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of Xml appliance parser.
 */
public class XmlApplianceParser implements ApplianceParser {
    private static List<Map<String, String>> appliancesParams;

    public List<Map<String, String>> parse(File dbFile) throws XmlParserException, ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        appliancesParams = new ArrayList<>();

        XMLHandler handler = new XMLHandler();
        parser.parse(dbFile, handler);

        return appliancesParams;
    }

    /**
     * Event handler to xml parser
     */
    private static class XMLHandler extends DefaultHandler {
        private boolean readingAppliances = false;
        private boolean finishedReadingAppliance = true;
        private String currentApplianceCategory;
        private Map<String, String> applianceParams = new HashMap<>();
        private String lastElementName;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
            if (qName.equals("appliances")) {
                readingAppliances = true;
            } else if (readingAppliances && finishedReadingAppliance) {
                finishedReadingAppliance = false;
                currentApplianceCategory = qName;
                applianceParams = new HashMap<>();
                applianceParams.put(ApplianceParam.CATEGORY, qName);
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equals("appliances")) {
                readingAppliances = false;
            } else if (qName.equals(currentApplianceCategory)) {
                finishedReadingAppliance = true;
                appliancesParams.add(applianceParams);
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (readingAppliances) {
                String data = new String(ch, start, length);
                data = data.replace("\n", "").trim();
                if (!data.isEmpty()) {
                    applianceParams.put(lastElementName.toUpperCase(), data);
                }
            }
        }
    }
}
