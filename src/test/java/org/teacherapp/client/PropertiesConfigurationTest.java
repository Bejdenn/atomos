package org.teacherapp.client;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.ClientExecutionException;
import org.teacherapp.core.commons.PropertiesConfiguration;

public class PropertiesConfigurationTest {

    @InjectMocks
    public PropertiesConfiguration config;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getResourcesIsSuccessfulTest() {
        config.load(AppConstants.PROPERTY_FILE);
    }

    @Test(expected = ClientExecutionException.class)
    public void getResourcesMissingFileTest() {
        config.load("testfile.properties");
    }

    @Test(expected = ClientExecutionException.class)
    public void getResourcesNullTest() {
        config.load(null);
    }

    @Test
    public void getPropertyTest() {
        this.getResourcesIsSuccessfulTest();
        assertEquals(config.getProperty(AppConstants.TITLE), "Atomos");
    }
}
