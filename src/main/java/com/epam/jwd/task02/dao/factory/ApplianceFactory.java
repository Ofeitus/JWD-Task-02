package com.epam.jwd.task02.dao.factory;

import com.epam.jwd.task02.entity.Appliance;

import java.util.Map;

public interface ApplianceFactory {
    Appliance create(Map<String, String> parameters);
}
