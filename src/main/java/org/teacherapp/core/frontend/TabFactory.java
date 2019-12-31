package org.teacherapp.core.frontend;

import de.saxsys.mvvmfx.ViewModel;
import javafx.scene.control.Tab;

public class TabFactory {

    private String text;
    private boolean closable;
    private boolean disable;
    private ViewBase<ViewModel> view;

    private TabFactory() {

    }

    public static TabFactory newFactory() {
        return new TabFactory();
    }

    public TabFactory setText(String text) {
        this.text = text;
        return this;
    }

    public TabFactory setClosable(boolean closable) {
        this.closable = closable;
        return this;
    }

    public TabFactory setDisable(boolean disable) {
        this.disable = disable;
        return this;
    }

    public TabFactory assignViewInstance(ViewBase view) {
        this.view = view;
        return this;
    }

    public Tab createTab() {
        Tab tab = new Tab();
        tab.setText(text);
        tab.setClosable(closable);
        tab.setDisable(disable);
        tab.setContent(view);
        return tab;
    }
}
