package org.teacherapp.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.PropertiesConfiguration;

public class ClientConfiguration {

    public static final Logger LOGGER = LogManager.getLogger(ClientConfiguration.class);

    public ClientConfiguration() {
        PropertiesConfiguration config = new PropertiesConfiguration();
        config.load(AppConstants.PROPERTY_FILE);
        LOGGER.info("ClientConfiguration was created and loaded successfully.");
    }
}
