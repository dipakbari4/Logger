package com.dipak.logger.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dipak Bari
 * @version 1.0.0
 * Logger properties
 */
public class Properties {
    private final Map<String, String> properties = new HashMap<>();

    /**
     * Get the value from properties
     * @param name Property key to retrieve value
     * @return  Property value
     */
    public String getValue(String name) {
        if (this.properties.size() > 0)
            return properties.get(name);
        return null;
    }

    /**
     * Set properties
     * @param properties Set properties from file
     */
    public void setProperties(Map<String, String> properties) {
        if (this.properties.size() > 0)
            this.properties.clear();
        this.properties.putAll(properties);
    }
}
