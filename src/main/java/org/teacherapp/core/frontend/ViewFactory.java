package org.teacherapp.core.frontend;

import javafx.scene.control.Tab;

/**
 * Factory that creates view instances based on value of ViewEnum.
 * 
 * @author dennisbejze
 *
 */
public class ViewFactory {

    private ViewFactory() {
    }

    public static Tab createView(ViewEnum view, ViewBase<?> viewBase) {
        Tab tab = null;
        switch (view) {
            case MAIN_MENU:
            case CLASSES:
            case EVENTS:
            case QUESTIONS_CATALOG:
            case TIMETABLE:
                tab = new TabBuilder().setText(view.getLabel()).setClosable(false).setDisable(false)
                        .assignViewInstance(viewBase).build();
                break;
            case CLASS:
                tab = new TabBuilder().setText(view.getLabel()).setClosable(true).setDisable(false)
                        .assignViewInstance(viewBase).build();
                // class + class properties
                break;
            default:
                break;
        }
        return tab;
    }

}
