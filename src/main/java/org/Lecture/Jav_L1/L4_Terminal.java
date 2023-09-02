package org.Lecture.Jav_L1;

import java.util.Scanner;

public class L4_Terminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Открываем терминал
        System.out.printf("name: ");
        String name = sc.nextLine(); // Принимаем всю строку
        //System.out.printf("Привет, %s!", name);
        System.out.printf("Привет, %s!\n", name); // если глюки с выводм, то можно поиграться \n
        sc.close(); // Закрываем терминал


        Scanner sc1 = new Scanner(System.in); // Открываем терминал
        System.out.printf("int a: ");
        int x = sc1.nextInt(); // Принимаем всю int
        System.out.printf("double b: ");
        double y = sc1.nextDouble(); // Принимаем всю double
        System.out.printf("%d + %f = %f", x, y, x + y);
        sc1.close();

        Scanner sc2 = new Scanner(System.in); // Открываем терминал
        System.out.printf("int a: ");
        boolean flag = sc2.hasNextInt(); // проверка на то что вводят int
        System.out.println(flag); // Если true, то принимаем
        int i = sc2.nextInt();
        System.out.println(i);
        sc2.close();



    }
}
