package com.dipak.logger;


import com.dipak.logger.model.Properties;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Main Logger API class
 */
public class Logger {
    private static Logger logger = null;

    private Logger() {
        System.out.println("Logger initialized");
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public Properties getProperties(String filePath) throws IOException {
        Properties p = new Properties();
        Map<String, String> keySet = getPropertiesFromFile(filePath);
        p.setProperties(keySet);
        return p;
    }

    /**
     * Internal method to extract properties from file
     * @param filePath Path of .properties file
     * @return  Map<String, String> Key/Value set of properties
     */
    private Map<String, String> getPropertiesFromFile(String filePath) throws IOException {
        File propertyFile = new File(filePath);
        Map<String, String> properties = new HashMap<>();
        if (propertyFile.exists()) {
            List<String> stringList = Files.readAllLines(Paths.get(propertyFile.getPath()));
            for(String line: stringList) {
                String[] set = line.split("=");
                properties.put(set[0], set[1]);
            }
        }
        return properties;
    }
}
