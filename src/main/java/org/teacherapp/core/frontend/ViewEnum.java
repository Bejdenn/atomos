package org.teacherapp.core.frontend;

public enum ViewEnum {
    MAIN_MENU("Hauptmenü"), CLASSES("Klassen"), EVENTS("Termine"), TIMETABLE("Stundenplan"), QUESTIONS_CATALOG(
            "Fragenkatalog"), CLASS("Klasse");

    private String label;

    private ViewEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
