package org.teacherapp.client.mainmenu;

import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.frontend.ViewBase;

import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class MainMenuView extends ViewBase<MainMenuViewModel> {

    public MainMenuView() {
        this.initializeGUI();
    }

    @Override
    protected void initializeGUI() {
        TilePane container = new TilePane();

        Button classesBtn = new Button(AppConstants.CLASSES);
        Button eventsBtn = new Button(AppConstants.EVENTS);
        Button timeTableBtn = new Button(AppConstants.TIMETABLE);
        Button questionsCatalogBtn = new Button(AppConstants.QUESTIONS_CATALOG);

        container.getChildren().addAll(classesBtn, eventsBtn, timeTableBtn, questionsCatalogBtn);

        this.setCenter(container);
    }
}
