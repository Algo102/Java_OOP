package org.Seminar.Sem_5.notebook.util;

import java.io.File;
// ДБКоннектор, класс отвечает за создание БД и подключение к ней
public class DBConnector {
    public static final String DB_PATH = "db.txt";
    public static void createDB() {
        try {
            File db = new File(DB_PATH);
            if (db.createNewFile()) {
                System.out.println("DB created");
            }
            else {
                System.out.println("DB already exists");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
