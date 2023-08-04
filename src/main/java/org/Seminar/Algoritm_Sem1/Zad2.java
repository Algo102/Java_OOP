package org.Seminar.Algoritm_Sem1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

//Написать алгоритм поиска простых чисел (делятся только на себя и на 1)
// в диапазоне от 1 до N. В алгоритме будет использоваться вложенный
// for, что явно говорит о квадратичной сложности. O(n^2)
// Т.е. если в алгоритме есть 1 фор, то сложность уже точно линейная, 2 фора - квадратичная,
// 3 фора - кубическая и т.д.
public class Zad2 {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        int lastNumber = 20;
        count.set(0); // счетчик нужно обнулять
        System.out.printf("Простые числа в диапазоне от 1 до %d: \n%s", lastNumber, findSimpleNumbers(lastNumber, count));
        System.out.println("\nКоличество итераций " + count.get());


        // или так
//        int num = 10;
//        for (int i = 1; i < num; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0)
//                    flag = false;
//            }
//            if (flag)
//                System.out.print(i + " ");
//        }
    }

    public static ArrayList<Integer> findSimpleNumbers(int lastNumber, AtomicInteger count){
        ArrayList<Integer> arl = new ArrayList<>();
        boolean simple;
        for (int i = 1; i <= lastNumber; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                count.getAndIncrement(); // count+1
                if(i%j == 0){
                    simple = false;
                    break;
                }
            }
            if(simple)
                arl.add(i);
        }
        return arl;
    }
}
