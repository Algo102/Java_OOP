package org.DZ.Except_DZ3.exception;

import java.io.IOException;

public class NotCreaterFileException extends IOException {
    public NotCreaterFileException(String message) {
        super("File not created: " + message);
    }
}