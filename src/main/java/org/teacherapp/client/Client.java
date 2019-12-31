package org.teacherapp.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.PropertiesConfiguration;
import org.teacherapp.core.frontend.DefaultWindowCreator;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Class that starts TeacherApp client.
 */
public class Client extends Application {

    public static final Logger LOGGER = LogManager.getLogger(Client.class);

    /**
     * The main method of the client.
     * 
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.loadConfiguration();
        DefaultWindowCreator.create().show();
        LOGGER.info("LoginView is started.");
    }

    /**
     * Loads configuration for client from properties file.
     */
    private void loadConfiguration() {
        PropertiesConfiguration config = PropertiesConfiguration.getInstance();
        config.load(AppConstants.PROPERTY_FILENAME);
        LOGGER.info("ClientConfiguration was created and loaded successfully.");
    }

}
