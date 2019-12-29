package org.teacherapp.core.frontend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.client.login.LoginView;
import org.teacherapp.client.mainmenu.MainMenuView;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.PropertiesConfiguration;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class DefaultWindowCreator {

    private static final Logger LOGGER = LogManager.getLogger(DefaultWindowCreator.class);
    private static TabPane tabs;

    private DefaultWindowCreator() {
        // private one to hide the public constructor
    }

    public static Stage create() {
        Stage stage = DefaultWindowCreator.initStage();

        TabPane tabs = new TabPane();
        Scene scene = new Scene(tabs);

        TabFactory tabFactory = TabFactory.createFactory();
        MainMenuView mainMenuViewInstance = new MainMenuView();
        Tab mainMenuTab = tabFactory.setTabProperties(AppConstants.MAIN_MENU, false).assignView(mainMenuViewInstance)
                .getTab();

        TabFactory tabFactory2 = TabFactory.createFactory();
        LoginView loginViewInstance = new LoginView();
        Tab classesTab = tabFactory2.setTabProperties(AppConstants.CLASSES, true).assignView(loginViewInstance)
                .getTab();

        tabs.getTabs().addAll(mainMenuTab, classesTab);
        stage.setScene(scene);

        LOGGER.info("Components for default window were created.");

        return stage;
    }

    private static Stage initStage() {
        Stage stage = new Stage();
        stage.setTitle(PropertiesConfiguration.getProperty(AppConstants.PROPERTY_ID_TITLE));
        stage.setResizable(true);

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        LOGGER.info("Properties of window were set up.");

        return stage;
    }

    public static TabPane getTabs() {
        return tabs;
    }

}
