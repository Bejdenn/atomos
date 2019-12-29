package org.teacherapp.core.commons.util;

public class ExceptionOutputUtil {
    public static String format(Exception e) {
        return e.getClass().getSimpleName() + ": " + e.getMessage();
    }
}
