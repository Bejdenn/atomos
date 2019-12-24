package org.teacherapp.client;

import org.junit.Test;
import org.teacherapp.core.commons.AppConstants;
import org.teacherapp.core.commons.AppResources;
import org.teacherapp.core.commons.ClientExecutionException;

public class AppResourcesTest {

    @Test
    public void getResourcesIsSuccessfulTest() {
        AppResources.getResources(AppConstants.PROPERTY_FILE);
    }

    @Test(expected = ClientExecutionException.class)
    public void getResourcesClientExecutionExceptionTest() {
        AppResources.getResources("testfile.properties");
        AppResources.getResources(null);
    }
}
