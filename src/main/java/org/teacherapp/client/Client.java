package org.teacherapp.client;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.AppResources;
import org.teacherapp.core.frontend.DefaultWindowCreator;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Class that starts TeacherApp client.
 */
public class Client extends Application {

    public static final Logger LOGGER = LogManager.getLogger(Client.class);
    private static final Properties properties = AppResources.getResources(AppConstants.PROPERTY_FILE);

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
        DefaultWindowCreator.create().show();
        LOGGER.info("LoginView is started.");
    }
}
