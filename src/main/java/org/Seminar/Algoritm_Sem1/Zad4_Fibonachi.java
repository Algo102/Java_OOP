package org.Seminar.Algoritm_Sem1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// Пишем алгоритм поиска нужного числа последовательности
// Фибоначчи. Считаем, что 1 и 2 значения последовательности
// равны 1. Искать будем по формуле On=On-1+On-2
// 0 1 1 2 3 5 8 13 21 34 55 ...
// 0 1 2 3 4 5 6 7  8  9  10
// Так как здесь рекурсия, то сложность экспотенциальная O(e^n)
public class Zad4_Fibonachi {
    public static void main(String[] args) {
        AtomicLong counter = new AtomicLong();
        counter.set(0);
        int lastNumber = 44;

        long startTime = System.currentTimeMillis();
        System.out.printf("Число Фибоначи для индекса %d равно %d (РЕКУРСИЯ) \n", lastNumber, fbExp(lastNumber, counter));
        System.out.println("Количество итераций " + counter.get());
        long endTime = System.currentTimeMillis();
        System.out.printf("Операция выполнилась за %d мс ", (endTime - startTime));

        counter.set(0);
        long startTime2 = System.currentTimeMillis();
        System.out.printf("Число Фибоначи для индекса %d равно %d \n", lastNumber, fbLine(lastNumber, counter));
        System.out.println("Количество итераций " + counter.get());
        long endTime2 = System.currentTimeMillis();
        System.out.printf("Операция выполнилась за %d мс ", (endTime2 - startTime2));


//        // с другого курса
//        // так как здесь рекурсия, то сложность экспотенциальная О(2^n)
//        Date start1 = new Date();
//        System.out.println(fibExp(30));
//        Date stop1 = new Date();
//        System.out.println(stop1.getTime() - start1.getTime() + " msec");
//
//        // Уже линейная зависимость О(n)
//        Date start2 = new Date();
//        fibLine(30);
//        Date stop2 = new Date();
//        System.out.println(stop2.getTime() - start2.getTime() + " msec");
    }



    static long fbExp(int num, AtomicLong counter){
        counter.getAndIncrement();
        if (num==0 || num ==1)
            return num;
        return fbExp(num-1, counter) + fbExp(num-2, counter);
    }

    // Линейная сложность O(n).
    static long fbLine(int num, AtomicLong counter){
        if (num==0 || num ==1)
            return num;
        long[] array = new long[num+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            counter.getAndIncrement();
            array[i] = array[i-1] + array[i-2];
        }
        return array[num];
    }
//    Число Фибоначи для индекса 44 равно 701408733 (РЕКУРСИЯ)
//    Количество итераций 2269806339
//    Операция выполнилась за 24445 мс
//    Число Фибоначи для индекса 44 равно 701408733
//    Количество итераций 43
//    Операция выполнилась за 1 мс

    // другое решение
//    public static void fibLine(int num){
//        int first = 1;
//        int second = 1;
//        for (int i = 2; i < num ; i++) {
//            int third = first + second;
//            first = second;
//            second = third;
//        }
//        System.out.println(second);
//    }
//
//    public static int fibExp(int n){
//        //System.out.println(n);
//        if (n <= 2)
//            return 1;
//        else
//            return fibExp(n-1) + fibExp (n-2);
//    }

}
