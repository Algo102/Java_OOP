package org.Seminar.Except_sem3;

import java.io.IOException;

public class ReadFileException extends IOException {
    public ReadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
