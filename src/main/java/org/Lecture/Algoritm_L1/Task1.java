package org.Lecture.Algoritm_L1;
//1. Допустимые делители для числа
// Зависимость линейная, т.к. количество шагов алгоритма, равно числу(один for) O(n)

//2. Поиск простых чисел, делятся на 1 и на себя
// Зависимость квадратичная, т.к. в каждом цикле проверяется другой цикл (два forа) O(n^2)

//3. Последовательность Фибоначи

//---------Разные сложности алгоритмов------------------
//O(1) - константная сложность. Не зависимо от размера входных данных,
//количество шагов не изменяется. Например, поиск по хэш-таблице.
//O(log n) - логарифмическая сложность. Рост размера входных данных почти не
//оказывает влияния на рост сложности. Для увеличения сложности на 1, размер
//входящих данных должен вырасти вдвое. Например, бинарный поиск
//O(n) - линейная сложность. Рост сложности линеен по отношению к росту размера
//входных данных. Например, поиск допустимого делителя, поиск по
//неотсортированному массиву
//O(n*log n) - рост сложности выше, чем у линейной, но ниже, чем у квадратичной
//сложности алгоритма. Например, алгоритм быстрой сортировки, сортировки пирамидой
//O(n^2) - квадратичная сложность. Значительный рост сложности от размера
//входящих данных. Например сортировка пузырьком
//O(2^n) - экспоненциальная сложность. При увеличении входящих данных на
//единицу, сложность растет в 2 раз.
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //List<Integer> availableDivider = findAvailableDivider(12);

//        List<Integer> availableDivider = findSimpleNumbers(100);
//        for (Integer integer: availableDivider){
//            System.out.println(integer);
//        }

        System.out.println(fib(10));
    }

    public static List<Integer> findAvailableDivider(int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if(number%i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max){
        List<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 1; i<=max; i++){
            for (int j = 2; i<j; j++) {
                if(i%j == 0){
                    simple =false;
                }
                if(simple){
                    result.add(i);
                }
            }
        }
        return result;
    }

    public static int fib(int position){
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fib(position-1) + fib(position - 2);
    }
}
