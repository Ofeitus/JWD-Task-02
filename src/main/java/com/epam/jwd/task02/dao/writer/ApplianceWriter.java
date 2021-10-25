package com.epam.jwd.task02.dao.writer;

import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.exception.XmlWriterException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

public interface ApplianceWriter {
    void append(File dbFile, Appliance appliance) throws XmlWriterException, ParserConfigurationException, IOException, SAXException, TransformerException;
}
