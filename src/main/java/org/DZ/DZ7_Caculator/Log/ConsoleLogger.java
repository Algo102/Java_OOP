package org.DZ.DZ7_Caculator.Log;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String text) {
        System.err.printf("%n%s : %n%s", LocalDateTime.now(), text);
    }
}
