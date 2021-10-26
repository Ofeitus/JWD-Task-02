package com.epam.jwd.task02.main;

import com.epam.jwd.task02.entity.Refrigerator;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.ServiceException;
import com.epam.jwd.task02.service.ApplianceService;
import com.epam.jwd.task02.service.ServiceFactory;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.entity.Oven;
import com.epam.jwd.task02.entity.TabletPC;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException {
        List<Appliance> applianceList;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        SearchCriteria searchCriteriaOven = new SearchCriteria(Oven.class.getSimpleName());
        searchCriteriaOven.add(ApplianceParam.Oven.CAPACITY.toString(), 33);

        applianceList = service.find(searchCriteriaOven);
        System.out.println("find1");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        SearchCriteria searchCriteriaTabletPC = new SearchCriteria(TabletPC.class.getSimpleName());
        searchCriteriaTabletPC.add(ApplianceParam.TabletPC.COLOR.toString(), "Blue");
        searchCriteriaTabletPC.add(ApplianceParam.TabletPC.DISPLAY_INCHES.toString(), 14);
        searchCriteriaTabletPC.add(ApplianceParam.TabletPC.MEMORY_ROM.toString(), 1000);

        applianceList = service.find(searchCriteriaTabletPC);
        System.out.println("find2");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        SearchCriteria searchCriteriaRefrigerator = new SearchCriteria("Refrigerator");

        applianceList = service.find(searchCriteriaRefrigerator);
        System.out.println("find3");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        applianceList = service.getAll();
        System.out.println("All Appliances:");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        Appliance refrigerator = new Refrigerator(
                0.1f,
                0.2f,
                0.3f,
                0.4f,
                0.5f,
                0.6f,
                0.7f
        );
        //service.add(refrigerator);
    }
}
