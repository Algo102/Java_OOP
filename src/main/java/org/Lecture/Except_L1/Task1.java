package org.Lecture.Except_L1;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("123")));
        // 0 так не правильно, т.к. по факту файла нет
        // после добавления проверки, выдает -1
        // с существующим файлом показало количество байт
        System.out.println(getFileSize(new File("untitled/db.txt")));

        System.out.println(divide(10, 0)); // без проверки / by zero

//        int[] ints = new int[10];
//        System.out.println(ints[1000]); // Index 1000 out of bounds for length 10

        a(); // Исключение стейк трейс.
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1000 out of bounds for length 10
//        at org.Lecture.Exept_L1.Task1.c(Task1.java:37)
//        at org.Lecture.Exept_L1.Task1.b(Task1.java:32)
//        at org.Lecture.Exept_L1.Task1.a(Task1.java:28)
//        at org.Lecture.Exept_L1.Task1.main(Task1.java:18)
    }
    // Ошибка в источнике и потом по цепочке
    // Чтоб посмотреть дерево ошибок, сделали методы которые вызывают друг друга
    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }



    // Новый метод, деление на 0
    public static int divide(int a1, int a2){
        if(a2 == 0){ // с проверкой код ошибки -1, но может ввести в заблуждение при 5/-5
            return -1;
        }
        return a1/a2;
    }

    // Создаем метод тут чтоб не создавать новый класс
    // Определяет размер файла, все библиотеки в Ява работают с long
    public static long getFileSize(File file){
        if(!file.exists()){ // Добавили проверку, если файл не существует
            return -1L; // то выдаем -1, такого размера не бывает
        }
        return  file.length();
    }
}
