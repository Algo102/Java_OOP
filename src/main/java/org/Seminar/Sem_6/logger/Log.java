package org.Seminar.Sem_6.logger;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    static {
        // На заметку про лог. Тут говорится, откуда читать лог
        try(FileInputStream in = new FileInputStream("log.config")){
            // Есть стандартный класс LogManager у него есть статический метод
            // getLogManager, который возвращает LogManager и теперь можем
            // прочитать конфигурацию и туда передаем ИНПУТСТРИМ
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
