package com.epam.jwd.task02.utils;

import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> applianceList) {
        if (applianceList != null) {
            for (Appliance appliance : applianceList) {
                System.out.println(appliance);
            }
        }
    }
}
