package org.teacherapp.client;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.configuration.PropertiesConfiguration;

public class PropertiesConfigurationTest {

    @InjectMocks
    public PropertiesConfiguration config;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getResourcesIsSuccessfulTest() {
        config.load(AppConstants.PROPERTY_FILENAME);
    }

    @Test(expected = ContextedRuntimeException.class)
    public void getResourcesMissingFileTest() {
        config.load("testfile.properties");
    }

    @Test(expected = ContextedRuntimeException.class)
    public void getResourcesNullTest() {
        config.load(null);
    }

    @Test
    public void getPropertyTest() {
        this.getResourcesIsSuccessfulTest();
        assertEquals(config.getProperty(AppConstants.PROPERTY_ID_TITLE), "Atomos");
    }
}
