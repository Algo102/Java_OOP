package org.Seminar.Algoritm_Sem1;

import java.util.concurrent.atomic.AtomicInteger;

public class Zad1 {
    public static void main(String[] args) {
        int lastNumber = 17;
        int counter = 0;
        StringBuilder sb = new StringBuilder("AAAAA");
        AtomicInteger count = new AtomicInteger();
        // Ссылочный тип данных, поэтому можно спокойно использовать в методе и использовать его как параметр
        System.out.printf("Сумма всех чисел от 1 до %d = %d\n", lastNumber,sum(lastNumber, count));
        // int это примитивный тип и не ссылочный поэтому при завершении метода и значение умирает,
        // которое успело накрутить в методе
        System.out.println("Количество операций " + counter); // 0
        //StringBuilder уже ссылочный тип, поэтому он живет и после завершения метода, по сути это объект,
        // созданный не явным образом. И не содержит значение, а указывает ссылкой на объект. Метод отработав,
        // удаляет ссылку, но в майн объект остается, и дает возможность посмотреть результат работы
        System.out.println(sb); //AAAAABBB
        System.out.println("Количество операций " + count.get());

        System.out.printf("Сумма всех чисел от 1 до %d = %d\n", lastNumber,sum1(lastNumber));

    }

    //Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
    // Сложность O(n) линейная
    public static int sum(int lastNumber, AtomicInteger count){
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
            //counter++;
            count.getAndIncrement(); //метод, который увеличивает значение на 1
        }
        //sb.append("BBB");
        return sum;
    }

    // O(1) - константная сложность, сложность не зависит от количества данных
    public static int sum1(int lastNumber){
        return ((lastNumber+1)/2)*lastNumber;
    }
}
