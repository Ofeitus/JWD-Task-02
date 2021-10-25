package com.epam.jwd.task02.dao.impl;

import com.epam.jwd.task02.dao.ApplianceDao;
import com.epam.jwd.task02.dao.parser.impl.XmlApplianceParser;
import com.epam.jwd.task02.dao.writer.impl.XmlApplianceWriter;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.entity.criteria.AppliancesParams;
import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.dao.factory.ApplianceFactoryProducer;
import com.epam.jwd.task02.exception.DaoException;
import com.epam.jwd.task02.exception.XmlParserException;
import com.epam.jwd.task02.exception.XmlWriterException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ApplianceDaoXml implements ApplianceDao {
    private final File dbFile = new File(
            Objects.requireNonNull(getClass().getClassLoader().getResource("db.xml")).getFile());

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        ApplianceFactory applianceFactory = ApplianceFactoryProducer.getFactory(criteria.getCategoryName());
        List<Appliance> appliances = new ArrayList<>();
        try {
            XmlApplianceParser xmlApplianceParser = new XmlApplianceParser();
            List<Map<String, String>> appliancesParams = xmlApplianceParser.parse(dbFile);
            for (Map<String, String> params : appliancesParams) {

                if (params.get(AppliancesParams.CATEGORY).equals(criteria.getCategoryName()) &&
                        criteria.getSearchCriteria().stream().allMatch(criterion ->
                                criteria.get(criterion).toString().equals(params.get(criterion)))) {
                    appliances.add(applianceFactory.create(params));
                }
            }
            return appliances;
        } catch (XmlParserException | ParserConfigurationException | IOException | SAXException e) {
            throw new DaoException(e);
        }
    }

    @Override
    public List<Appliance> getAll() throws DaoException {
        List<Appliance> appliances = new ArrayList<>();
        try {
            XmlApplianceParser xmlApplianceParser = new XmlApplianceParser();
            List<Map<String, String>> appliancesParams = xmlApplianceParser.parse(dbFile);
            for (Map<String, String> params : appliancesParams) {
                ApplianceFactory applianceFactory = ApplianceFactoryProducer.getFactory(
                        params.get(AppliancesParams.CATEGORY));
                appliances.add(applianceFactory.create(params));
            }
            return appliances;
        } catch (XmlParserException | ParserConfigurationException | IOException | SAXException e) {
            throw new DaoException(e);
        }
    }

    @Override
    public void add(Appliance appliance) throws DaoException {
        try {
            XmlApplianceWriter xmlApplianceWriter = new XmlApplianceWriter();
            xmlApplianceWriter.append(dbFile, appliance);
        } catch (XmlWriterException | IOException | ParserConfigurationException | SAXException | TransformerException e) {
            throw new DaoException(e);
        }
    }
}
