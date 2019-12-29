package org.teacherapp.core.frontend;

import javafx.scene.control.Tab;

public class TabFactory {

    private Tab tab;

    private TabFactory() {
        tab = new Tab();
    }

    public static TabFactory createFactory() {
        return new TabFactory();
    }

    public TabFactory setTabProperties(String description, boolean disable) {
        tab.setText(description);
        tab.setClosable(false);
        tab.setDisable(disable);
        return this;
    }

    public TabFactory assignView(ViewBase view) {
        tab.setContent(view);
        return this;
    }

    public Tab getTab() {
        return tab;
    }
}
