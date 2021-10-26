package com.epam.jwd.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SearchCriteria {
    private String category;

    private final Map<String, Object> parameters = new HashMap<>();

    public SearchCriteria() {

    }

    public SearchCriteria(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void add(String searchCriteria, Object value) {
        parameters.put(searchCriteria, value);
    }

    public Set<String> getSearchCriteria() {
        return parameters.keySet();
    }

    public void remove(String searchCriteria) {
        parameters.remove(searchCriteria);
    }

    public int size() {
        return parameters.size();
    }

    public boolean isEmpty() {
        return parameters.isEmpty();
    }

    public boolean containsCriteria(String searchCriteria) {
        return parameters.containsKey(searchCriteria);
    }

    public Object get(String searchCriteria) {
        return parameters.get(searchCriteria);
    }
}
