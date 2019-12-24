package org.teacherapp.core.commons;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.client.Client;

public class AppResources {
    public static final Logger LOGGER = LogManager.getLogger(AppResources.class);

    public static Properties getResources(String propFile) {
        Properties prop = new Properties();
        try (InputStream input = Client.class.getClassLoader().getResourceAsStream(propFile)) {
            prop.load(input);
            LOGGER.info("Resources file was successfully loaded.");
            return prop;
        } catch (NullPointerException | IOException e) {
            throw new ClientExecutionException(AppResources.class.getName(), e);
        }
    }
}
