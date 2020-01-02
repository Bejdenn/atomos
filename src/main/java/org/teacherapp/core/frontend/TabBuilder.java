package org.teacherapp.core.frontend;

import de.saxsys.mvvmfx.ViewModel;
import javafx.scene.control.Tab;

public class TabBuilder {
    private String text;
    private boolean closable;
    private boolean disable;
    private ViewBase<?> view;

    public TabBuilder() {

    }

    public TabBuilder(String text, boolean closable, boolean disable, ViewBase<ViewModel> view) {
        this.text = text;
        this.closable = closable;
        this.disable = disable;
        this.view = view;
    }

    public TabBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public TabBuilder setClosable(boolean closable) {
        this.closable = closable;
        return this;
    }

    public TabBuilder setDisable(boolean disable) {
        this.disable = disable;
        return this;
    }

    public TabBuilder assignViewInstance(ViewBase<?> view) {
        this.view = view;
        return this;
    }

    public Tab build() {
        Tab tab = new Tab();
        tab.setText(text);
        tab.setClosable(closable);
        tab.setDisable(disable);
        tab.setContent(view);
        return tab;
    }
}
