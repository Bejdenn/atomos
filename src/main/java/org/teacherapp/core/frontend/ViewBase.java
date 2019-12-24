package org.teacherapp.core.frontend;

import de.saxsys.mvvmfx.ViewModel;
import de.saxsys.mvvmfx.internal.viewloader.View;
import javafx.scene.layout.BorderPane;

public abstract class ViewBase<VM extends ViewModel> extends BorderPane implements View<VM> {
    protected void initializeGUI() {

    }

    public void prepareView() {
        
    }
}
