package org.teacherapp.core.frontend;

import org.teacherapp.core.commons.AppConstants;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class DefaultWindowCreator {

    private DefaultWindowCreator() {
        // private one to hide the public constructor
    }

    public static Stage create() {
        Stage stage = DefaultWindowCreator.initStage();
        TabPane tabs = new TabPane();
        Scene scene = new Scene(tabs);

        BorderPane node1 = new BorderPane();
        Button button = new Button("Seite 1");
        button.setOnAction(e -> tabs.getSelectionModel().select(1));
        node1.setCenter(button);
        Tab tab1 = new Tab();
        tab1.setText("Seite 1");
        tab1.setClosable(false);
        tab1.setContent(node1);

        BorderPane node2 = new BorderPane();
        node2.setCenter(new Text("Blah2"));
        Tab tab2 = new Tab();
        tab2.setText("Seite 2");
        tab2.setContent(node2);

        tabs.getTabs().addAll(tab1, tab2);
        stage.setScene(scene);

        return stage;
    }

    private static Stage initStage() {
        Stage stage = new Stage();
        stage.setTitle(AppConstants.PROPERTY_ID_TITLE);
        stage.setResizable(true);

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        return stage;
    }
}
