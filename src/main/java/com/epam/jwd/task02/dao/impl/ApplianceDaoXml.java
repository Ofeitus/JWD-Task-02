package com.epam.jwd.task02.dao.impl;

import com.epam.jwd.task02.constant.ResourceName;
import com.epam.jwd.task02.dao.ApplianceDao;
import com.epam.jwd.task02.dao.parser.impl.XmlApplianceParser;
import com.epam.jwd.task02.dao.writer.impl.XmlApplianceWriter;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.dao.factory.ApplianceFactoryProvider;
import com.epam.jwd.task02.dao.DaoException;
import com.epam.jwd.task02.dao.parser.XmlParserException;
import com.epam.jwd.task02.dao.writer.XmlWriterException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Implementation of Appliance dao xml.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class ApplianceDaoXml implements ApplianceDao {
    private final File dbFile = new File(
            Objects.requireNonNull(getClass().getClassLoader().getResource(ResourceName.dbName)).getFile());

    @Override
    public List<Appliance> find(SearchCriteria searchCriteria) throws DaoException {
        ApplianceFactory applianceFactory = ApplianceFactoryProvider.getFactory(searchCriteria.getCategory());
        List<Appliance> appliances = new ArrayList<>();
        try {
            XmlApplianceParser xmlApplianceParser = new XmlApplianceParser();
            List<Map<String, String>> appliancesParams = xmlApplianceParser.parse(dbFile);
            for (Map<String, String> params : appliancesParams) {

                if (params.get(ApplianceParam.CATEGORY).equals(searchCriteria.getCategory()) &&
                        searchCriteria.getSearchCriteria().stream().allMatch(criterion ->
                                searchCriteria.get(criterion).toString().equals(params.get(criterion)))) {
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
                ApplianceFactory applianceFactory = ApplianceFactoryProvider.getFactory(
                        params.get(ApplianceParam.CATEGORY));
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
