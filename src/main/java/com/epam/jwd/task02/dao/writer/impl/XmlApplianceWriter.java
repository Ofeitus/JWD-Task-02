package com.epam.jwd.task02.dao.writer.impl;

import com.epam.jwd.task02.dao.writer.ApplianceWriter;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.dao.writer.XmlWriterException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Implementation of Xml appliance writer.
 */
public class XmlApplianceWriter implements ApplianceWriter {
    /**
     * Remove whitespaces in xml file
     *
     * @param element the element
     */
    public void removeWhitespaces(Element element) {
        NodeList children = element.getChildNodes();
        for (int i = children.getLength() - 1; i >= 0; i--) {
            Node child = children.item(i);
            if (child instanceof Text
                    && ((Text) child).getData().trim().isEmpty()) {
                element.removeChild(child);
            } else if (child instanceof Element) {
                removeWhitespaces((Element) child);
            }
        }
    }

    public void append(File dbFile, Appliance appliance) throws XmlWriterException, ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(dbFile);
        Element appliancesList = (Element) document.getElementsByTagName("appliances").item(0);

        // remove whitespaces
        removeWhitespaces(document.getDocumentElement());

        // add element
        Element newAppliance = document.createElement(appliance.getParams().get(ApplianceParam.CATEGORY));

        for (String param : appliance.getParams().keySet()) {
            if (!param.equals(ApplianceParam.CATEGORY)) {
                Element element = document.createElement(param.toLowerCase());
                element.appendChild(document.createTextNode(appliance.getParams().get(param)));
                newAppliance.appendChild(element);
            }
        }

        appliancesList.appendChild(newAppliance);

        DOMSource source = new DOMSource(document);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult(dbFile);
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);
    }
}
