package org.Seminar.Except_Sem1;

import java.util.Scanner;

// Реализуйте метод, принимающий в качестве аргумента целочисленный
// массив и некоторое значение. Метод ищет это значение и возвращает
// его индекс, если длина массива, меньше заданного минимум, возвращается-1,
// как код ошибки? если элемент не найден, то -2, если вместо массива
// пришел null, то -3
public class Zad2 {
    public static void main(String[] args) {
        int[] array = new int[]{6,9,12,5,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое значение ");
        int number = sc.nextInt();
        System.out.println("Введите минимальную длину массива ");
        int minlength = sc.nextInt();
        System.out.println(checkArray(array, number, minlength));
        sc.close();
    }

    public static int checkArray(int[] array, int number, int minLength){

        int num = -2;
        if(array==null){
            System.out.println("Массив не инициализирован");
            return -3 ;
        }
        if(array.length==0){
            System.out.println("Массив пустой");
            return -3 ;
        }
        if(array.length<minLength) {
            System.out.println("Массив слишком мал");
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                System.out.println("Позиция числа");
                num = i;
            }
        }
        if(num == -2){
            System.out.println("Такого числа нет");
        }

        return num;
    }
}
