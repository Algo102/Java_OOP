package org.Seminar.Except_Sem2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элементы, в который записать значение 1");
        int index = scanner.nextInt();

        // В данном случае не забивать память, а проверить через if
//        try {
//            arr[index] = 1;
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Указан индекс за пределами массива");
//        }
        if(arr.length>index && index >= 0) {
            arr[index] = 1;
        } else  {
            System.out.println("Указан индекс за пределами массива");
        }
    }
}
