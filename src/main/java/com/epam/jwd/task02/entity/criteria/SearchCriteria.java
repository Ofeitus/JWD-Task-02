package com.epam.jwd.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class used to represent criteria while searching appliances.
 * contains appliance category and map of parameters:
 * Key - parameter name, Value - parameter value
 *
 */
public class SearchCriteria {
    private String category;

    private final Map<String, Object> parameters = new HashMap<>();

    /**
     * Instantiates a new Search criteria.
     */
    public SearchCriteria() {

    }

    /**
     * Instantiates a new Search criteria with specific appliance category
     *
     * @param category the category
     */
    public SearchCriteria(String category) {
        this.category = category;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Adds search criteria
     *
     * @param searchCriteria the search criteria
     * @param value          the value
     */
    public void add(String searchCriteria, Object value) {
        parameters.put(searchCriteria, value);
    }

    /**
     * Gets search criteria.
     *
     * @return the search criteria
     */
    public Set<String> getSearchCriteria() {
        return parameters.keySet();
    }

    /**
     * Remove.
     *
     * @param searchCriteria the search criteria
     */
    public void remove(String searchCriteria) {
        parameters.remove(searchCriteria);
    }

    /**
     * Size int.
     *
     * @return number of parameters in criteria
     */
    public int size() {
        return parameters.size();
    }

    /**
     * Is empty boolean.
     *
     * @return if criteria is empty
     */
    public boolean isEmpty() {
        return parameters.isEmpty();
    }

    /**
     * Contains criteria boolean.
     *
     * @param searchCriteria the search criteria
     * @return if criteria contains specific parameter
     */
    public boolean containsCriteria(String searchCriteria) {
        return parameters.containsKey(searchCriteria);
    }

    /**
     * Get parameter value by it's name
     *
     * @param searchCriteria the search criteria
     * @return the object
     */
    public Object get(String searchCriteria) {
        return parameters.get(searchCriteria);
    }
}
