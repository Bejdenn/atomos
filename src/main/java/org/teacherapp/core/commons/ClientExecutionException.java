package org.teacherapp.core.commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientExecutionException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LogManager.getLogger(ClientExecutionException.class);

    public ClientExecutionException(String className, Exception exception) {
        LOGGER.error("Application was terminated because of {} in class {}: {}", exception.getClass().getSimpleName(),
                className, exception.getMessage());
    }

}
