package com.epam.jwd.task02.main;

import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

/**
 * Class used to appliance info.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class PrintApplianceInfo {
    /**
     * Print appliances string representation to std out
     *
     * @param applianceList the appliance list
     */
    public static void print(List<Appliance> applianceList) {
        if (applianceList != null) {
            for (Appliance appliance : applianceList) {
                System.out.println(appliance);
            }
        }
    }
}
