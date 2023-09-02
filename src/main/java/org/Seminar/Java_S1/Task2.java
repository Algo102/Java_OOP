package org.Seminar.Java_S1;

public class Task2 {
    /**
     * Дан массив двоичных чисел, например [1,1,0,1,1,1],
     * вывести максимальное количество подряд идущих 1.
     */
    public static int run(int[] array){
        int count = 0;
        int max_count = 0;

        for (int item: array) {
            if(item == 1){
                count++;
            }
            else {
                if(max_count < count){
                    max_count = count;
                }
                count = 0;
            }
        }
        // Повторно проверяем условие, если в конце нет 0
        if(max_count < count) {
            max_count = count;
        }
        return max_count;
    }
}
