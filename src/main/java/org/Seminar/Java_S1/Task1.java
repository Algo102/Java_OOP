package org.Seminar.Java_S1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// Настроить проект. Вывести в консоль Хелоу Ворд
// Вывести в консоль системные дату и время
public class Task1 {
    public static void run(){
        // void в методе, говорит, что ничего не возвращаем, если бы написали int то нужен return
        System.out.println("Hello World");

        System.out.println(LocalDateTime.now()); // Можно и так, с точностью до нано секунд


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy г., время: hh ч. mm мин. ss сек.");
        // МММ название месяца буквами
        System.out.println(formatter.format(now));
    }
}
