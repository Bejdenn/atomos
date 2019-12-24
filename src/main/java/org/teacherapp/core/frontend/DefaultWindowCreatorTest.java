package org.teacherapp.core.frontend;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.teacherapp.client.Client;

public class DefaultWindowCreatorTest {

    @Parameter
    public Client client;

    @Before
    public void prepareClientStart() {
        Client.main(null);
    }

    @Ignore
    @Test
    public void test() {
        DefaultWindowCreator.create();
    }

}
