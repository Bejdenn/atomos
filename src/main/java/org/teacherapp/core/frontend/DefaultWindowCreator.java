package org.teacherapp.core.frontend;

import org.teacherapp.core.commons.AppConstants;

import javafx.stage.Stage;

public class DefaultWindowCreator {

    private DefaultWindowCreator() {
        // private one to hide the public constructor
    }

    public static Stage create() {
        Stage stage = new Stage();
        stage.setTitle(AppConstants.TITLE);
        return stage;
    }
}
