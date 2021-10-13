package com.epam.jwd.task02.factory;

import java.util.Map;

public interface Factory<T> {
    T create(Map<String, String> parameters);
}
