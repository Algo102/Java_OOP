package org.Seminar.Java_S1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Открываем работу с терминалом. cp866 - русская кодировка
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите имя: ");
        String name = sc.next();

        // .nextLine()   --- Считывает строчку
        // .next() --- считывает элемент
        // .nextInt() --- считывает Число

        // print - вывод без переноса коретки
        // println - с переносом коретки
        // printf - работа с функионалом

        //12 \n
        // num = 12
        // .... sc.nextLine(); //
        System.out.printf("Привет, %s", name); // %s - передаем строку
        sc.close(); // Закрываем работу с терминалом
    }
}
