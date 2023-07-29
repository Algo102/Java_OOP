package org.Seminar.Except_Sem1;

import java.util.Scanner;

// Реализуйте метод, принимающий в качестве аргумента целочисленный
// массив и некоторое значение. Метод ищет это значение и возвращает
// его индекс, если длина массива, меньше заданного минимум, возвращается-1,
// как код ошибки? если элемент не найден, то -2, если вместо массива
// пришел null, то -3
public class Zad2_1 {
    public static void main(String[] args) {
        int[] array = new int[]{6,9,12,5,7};
        dialog(array);
    }

    private static void dialog(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое значение ");
        int number = sc.nextInt();
        System.out.println("Введите минимальную длину массива ");
        int minlength = sc.nextInt();
        int code = (checkArray(array, number, minlength));
        parseCode(code);
        sc.close();
    }

    private static void parseCode(int code) {
        switch (code){
            case -1:
                System.out.println("Массив слишком мал");
                break;
            case -2:
                System.out.println("Такого значения нет");
                break;
            case -3:
                System.out.println("Массив не инициализирован");
                break;
            default:
                System.out.println("Позиция числа ");
        }
    }

    public static int checkArray(int[] array, int number, int minLength){
        if(array==null){
            System.out.println("Код ошибки " + -3);
            return -3 ;
        }
        if(array.length<minLength) {
            System.out.println("Код ошибки " + -1);
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return i;
            }
        }
        System.out.println("Код ошибки " + -2);
        return -2;
    }
}
