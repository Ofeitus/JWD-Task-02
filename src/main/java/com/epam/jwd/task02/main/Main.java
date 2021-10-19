package com.epam.jwd.task02.main;

import com.epam.jwd.task02.entity.Refrigerator;
import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.exception.ServiceException;
import com.epam.jwd.task02.service.ApplianceService;
import com.epam.jwd.task02.service.ServiceFactory;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.entity.Oven;
import com.epam.jwd.task02.entity.TabletPC;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException {
        List<Appliance> applianceList;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);

        applianceList = service.find(criteriaOven);

        System.out.println("find1");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "Blue");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 1000);

        applianceList = service.find(criteriaTabletPC);

        System.out.println("find3");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Refrigerator.class.getSimpleName());

        applianceList = service.find(criteriaOven);

        System.out.println("find2");
        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        applianceList = service.findMin(SearchCriteria.PRICE);

        System.out.println("find2");
        PrintApplianceInfo.print(applianceList);
    }
}
