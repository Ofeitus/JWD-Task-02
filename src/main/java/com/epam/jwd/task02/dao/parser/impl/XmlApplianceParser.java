package com.epam.jwd.task02.dao.parser.impl;

import com.epam.jwd.task02.dao.parser.ApplianceParser;
import com.epam.jwd.task02.entity.criteria.AppliancesNames;
import com.epam.jwd.task02.entity.criteria.AppliancesParams;
import com.epam.jwd.task02.exception.XmlParserException;
import com.epam.jwd.task02.utils.EnumUtils;
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

    private static class XMLHandler extends DefaultHandler {
        private String lastElementName;
        private Map<String, String> params = new HashMap<>();

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
            if (EnumUtils.isValidEnum(AppliancesNames.class, qName)) {
                params = new HashMap<>();
                params.put(AppliancesParams.CATEGORY, qName);
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (EnumUtils.isValidEnum(AppliancesNames.class, qName)) {
                appliancesParams.add(params);
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String data = new String(ch, start, length);
            data = data.replace("\n", "").trim();
            if (!data.isEmpty()) {
                params.put(lastElementName.toUpperCase(), data);
            }
        }
    }
}
