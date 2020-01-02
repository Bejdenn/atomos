package org.teacherapp.core.frontend;

import org.teacherapp.core.commons.AppConstants;

import de.saxsys.mvvmfx.ViewModel;
import de.saxsys.mvvmfx.internal.viewloader.View;
import javafx.scene.layout.BorderPane;

public abstract class ViewBase<VM extends ViewModel> extends BorderPane implements View<VM> {

    protected void initializeGUI() {

    }

    protected void prepareView() {

    }

    protected static <T extends ViewBase> Object createInstance(Class<T> view) {
        return null;
    }

    protected void loadStyle() {
        this.getStylesheets().add(AppConstants.PROPERTY_ID_STYLESHEET);
    }

}
