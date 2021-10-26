package com.epam.jwd.task02.dao.writer;

import com.epam.jwd.task02.entity.Appliance;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

/**
 * The interface to Appliance writer.
 *
 * @author Ofeitus
 * @version 1.0
 */
public interface ApplianceWriter {
    /**
     * Appends appliance to xml file
     *
     * @param dbFile    the db file
     * @param appliance the appliance
     * @throws XmlWriterException           the xml writer exception
     * @throws ParserConfigurationException the parser configuration exception
     * @throws IOException                  the io exception
     * @throws SAXException                 the sax exception
     * @throws TransformerException         the transformer exception
     */
    void append(File dbFile, Appliance appliance) throws XmlWriterException, ParserConfigurationException, IOException, SAXException, TransformerException;
}
