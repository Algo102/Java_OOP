package org.Seminar.Sem_7.DecoratorFactory.Log;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String any) {
        System.err.printf("%n%s : %n%s", LocalDateTime.now(), any);
    }
}
