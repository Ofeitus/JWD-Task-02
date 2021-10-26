package com.epam.jwd.task02.dao.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The interface to Appliance parser.
 *
 * @author Ofeitus
 * @version 1.0
 */
public interface ApplianceParser {
    /**
     * Parse xml file
     *
     * @param dbFile the db file
     * @return list of appliances
     * @throws XmlParserException           the xml parser exception
     * @throws ParserConfigurationException the parser configuration exception
     * @throws SAXException                 the sax exception
     * @throws IOException                  the io exception
     */
    List<Map<String, String>> parse(File dbFile) throws XmlParserException, ParserConfigurationException, SAXException, IOException;
}
