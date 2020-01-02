package org.teacherapp.core.commons.configuration;

public interface Configuration {
    public void load(String propertiesFile);

    public String getProperty(String key);
}
