package org.Seminar.Algoritm_Sem2;

import java.util.Random;
// Утилиты для работы с массивом
public class ArrayUtils {

    private static Random rnd = new Random();

    // Массив случайных чисел
    public static int[] prepareArray(){
//        int[] array= new int[rnd.nextInt(10,16)];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rnd.nextInt(-99, 100);
//        }
//        return array;
        return prepareArray(rnd.nextInt(10, 16));
    }

    // Массив случайных чисел с указанием размерности
    public static int[] prepareArray(int length){
        int[] array= new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-99, 100);
        }
        return array;
    }

    // Вывод массива в консоль
    public static void printArray(int[] array){
        for (int elem: array) {
            System.out.printf("%d\t", elem);
        }
        System.out.println();
    }
}
