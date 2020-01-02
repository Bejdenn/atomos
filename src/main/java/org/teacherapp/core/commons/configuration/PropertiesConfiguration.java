package org.teacherapp.core.commons.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.client.Client;

/**
 * Class that configures properties object based on configuration file in project hierarchy.
 * 
 * @author dennisbejze
 *
 */
public class PropertiesConfiguration implements Configuration {
    public static final Logger LOGGER = LogManager.getLogger(PropertiesConfiguration.class);
    private Properties property;
    private static Configuration INSTANCE;

    private PropertiesConfiguration() {
        // hide public constructor
    }

    /**
     * Loads properties from file at given relative or absolute path. Method overwrites property when it is called more
     * than one time.
     * 
     * @param propertiesFile
     *            Relative or absolute path of configuration file
     */
    public void load(String propertiesFile) {
        if (property == null) {
            property = new Properties();
        }
        property = this.getResources(propertiesFile);
    }

    private Properties getResources(String propertiesFile) {
        try (InputStream input = Client.class.getClassLoader().getResourceAsStream(propertiesFile)) {
            property.load(input);
            LOGGER.info("Resources file was successfully loaded.");
            return property;
        } catch (NullPointerException | IOException e) {
            throw new ContextedRuntimeException("Error configuring application properties", e).addContextValue("Cause",
                    e.getMessage());
        }
    }

    /**
     * Returns value of key from properties file.
     * 
     * @param key
     * @return
     */
    public String getProperty(String key) {
        return property.getProperty(key);
    }

    public static Configuration getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PropertiesConfiguration();
        }
        return INSTANCE;
    }

}
