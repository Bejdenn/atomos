package org.teacherapp.core.frontend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.client.classes.ClassesView;
import org.teacherapp.client.events.EventsView;
import org.teacherapp.client.mainmenu.MainMenuView;
import org.teacherapp.client.questioncatalog.QuestionsCatalogView;
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
        Stage stage = new Stage();
        stage.setTitle(PropertiesConfiguration.getInstance().getProperty(AppConstants.PROPERTY_ID_TITLE));
        stage.setResizable(true);

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        LOGGER.info("Properties of window were set up.");

        TabPane tabs = new TabPane();
        Scene scene = new Scene(tabs);

        MainMenuView mainMenuViewInstance = new MainMenuView();
        Tab mainMenuTab = TabFactory.newFactory().setText(AppConstants.MAIN_MENU).setClosable(false).setDisable(false)
                .assignViewInstance(mainMenuViewInstance).createTab();

        ClassesView classesViewInstance = new ClassesView();
        Tab classesTab = TabFactory.newFactory().setText(AppConstants.CLASSES).setClosable(false).setDisable(false)
                .assignViewInstance(classesViewInstance).createTab();

        EventsView eventsViewInstance = new EventsView();
        Tab eventsTab = TabFactory.newFactory().setText(AppConstants.EVENTS).setClosable(false).setDisable(false)
                .assignViewInstance(eventsViewInstance).createTab();

        QuestionsCatalogView questionsCatalogViewInstance = new QuestionsCatalogView();
        Tab questionsCatalogTab = TabFactory.newFactory().setText(AppConstants.QUESTIONS_CATALOG).setClosable(false)
                .setDisable(false).assignViewInstance(questionsCatalogViewInstance).createTab();

        tabs.getTabs().addAll(mainMenuTab, classesTab, eventsTab, questionsCatalogTab);
        stage.setScene(scene);

        LOGGER.info("Components for default window were created.");

        return stage;
    }

}
