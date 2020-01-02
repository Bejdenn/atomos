package org.teacherapp.core.frontend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teacherapp.client.classes.ClassesView;
import org.teacherapp.client.classes.ClassesViewModel;
import org.teacherapp.client.events.EventsView;
import org.teacherapp.client.events.EventsViewModel;
import org.teacherapp.client.mainmenu.MainMenuView;
import org.teacherapp.client.mainmenu.MainMenuViewModel;
import org.teacherapp.client.questioncatalog.QuestionsCatalogView;
import org.teacherapp.client.questioncatalog.QuestionsCatalogViewModel;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.configuration.PropertiesConfiguration;

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

        ViewBase<MainMenuViewModel> mainMenuViewInstance = new MainMenuView();
        Tab mainMenuTab = ViewFactory.createView(ViewEnum.MAIN_MENU, mainMenuViewInstance);

        ViewBase<ClassesViewModel> classesViewInstance = new ClassesView();
        Tab classesTab = ViewFactory.createView(ViewEnum.CLASSES, classesViewInstance);

        ViewBase<EventsViewModel> eventsViewInstance = new EventsView();
        Tab eventsTab = ViewFactory.createView(ViewEnum.EVENTS, eventsViewInstance);

        ViewBase<QuestionsCatalogViewModel> questionsCatalogViewInstance = new QuestionsCatalogView();
        Tab questionsCatalogTab = ViewFactory.createView(ViewEnum.QUESTIONS_CATALOG, questionsCatalogViewInstance);

        tabs.getTabs().addAll(mainMenuTab, classesTab, eventsTab, questionsCatalogTab);
        stage.setScene(scene);

        LOGGER.info("Components for default window were created.");

        return stage;
    }

}
