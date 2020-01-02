package org.teacherapp.client.mainmenu;

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

        Button classesBtn = new Button();

        container.getChildren().addAll(classesBtn);

        this.setCenter(container);
    }
}
