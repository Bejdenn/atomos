package com.elinis.projectteacher.client.classes;

import org.teacherapp.core.frontend.ViewBase;

import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class ClassesView extends ViewBase<ClassesViewModel> {

    public ClassesView() {
        this.initializeGUI();
    }

    @Override
    protected void initializeGUI() {
        TilePane container = new TilePane();
        Button classesBtn = new Button("4c");
        container.getChildren().addAll(classesBtn);

        this.setCenter(container);
    }
}
