package org.teacherapp.core.commons;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.client.Client;

public class PropertiesConfiguration {
    public static final Logger LOGGER = LogManager.getLogger(PropertiesConfiguration.class);
    private Properties property;
    private static PropertiesConfiguration INSTANCE;

    private PropertiesConfiguration() {

    }

    public void load(String propFile) {
        property = new Properties();
        property = this.getResources(propFile);
    }

    private Properties getResources(String propFile) {
        try (InputStream input = Client.class.getClassLoader().getResourceAsStream(propFile)) {
            property.load(input);
            LOGGER.info("Resources file was successfully loaded.");
            return property;
        } catch (NullPointerException | IOException e) {
            throw new ContextedRuntimeException("Error configuring application properties", e).addContextValue("Cause",
                    e.getMessage());
        }
    }

    public String getProperty(String key) {
        return property.getProperty(key);
    }

    public static PropertiesConfiguration getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PropertiesConfiguration();
        }
        return INSTANCE;
    }
}
