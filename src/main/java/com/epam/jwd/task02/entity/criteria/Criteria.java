package com.epam.jwd.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {
    private String categoryName;

    private final Map<String, Object> criteria = new HashMap<>();

    public Criteria() {

    }

    public Criteria(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Set<String> getSearchCriteria() {
        return criteria.keySet();
    }

    public void remove(String searchCriteria) {
        criteria.remove(searchCriteria);
    }

    public int size() {
        return criteria.size();
    }

    public boolean isEmpty() {
        return criteria.isEmpty();
    }

    public boolean containsCriteria(String searchCriteria) {
        return criteria.containsKey(searchCriteria);
    }

    public Object get(String searchCriteria) {
        return criteria.get(searchCriteria);
    }
}
