package org.Seminar.Java_S1;

import java.util.Arrays;

// Дан массив array = [3,2,4,3,3,1,5,3,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.
// [2 4 1 5 3 3 3 3 3]
// Работать разрешается только с 1 массивом.
public class Task4 {
    public static void main(String[] args) {

        int[] array = { 3,2,4,3,3,1,5,3,3 };
        int value = 3;
        int counter = 0;

        // for (int i = 0; i < array.length-counter; i++) {
        //   if (array[i] == value){
        //     counter++;
        //     for (int j = i; j < array.length - 1; j++)
        //       array[j] = array[j+1];
        //     array[array.length -1] = value;
        //     i--;
        //   }
        // }
        // System.out.println(Arrays.toString(array));

// ТО ЖЕ САМОЕ, только counter вынесен -----------------------------------
        // for (int i = 0; i < array.length; i++) {
        //   if (array[i] == value)
        //     counter += 1;
        // }

        // for (int i = 0; i < array.length - counter; i++) {
        //   if (array[i] == value) {
        //     for (int j = i; j < array.length - 1; j++)
        //       array[j] = array[j+1];
        //     array[array.length -1] = value;
        //     i--;
        //   }
        // }
        // System.out.println(Arrays.toString(array));


        // Другой вариант (Пузырьковая сортировка)----------------------------
        // int temp = 0;
        // for (int i = 1; i < array.length - counter; i++) {
        //   if (array[i] == value)
        //   counter++;
        //   for (int j = i; j < array.length; j++) {
        //     if (array[j-1] == value) {
        //         temp = array[j-1];
        //         array[j-1] = array[j];
        //         array[j] = temp;
        //     }
        //   }
        // System.out.println(Arrays.toString(array));
        // }

        // Другое решение с одним циклом
        // Глючное решение, если 3 будет только последней, то выдаст все тройки, потому что идет замена троек
        // for (int i = 0; i < array.length; i++){
        //   if(array[i] != 3){
        //     array[counter] = array[i];
        //     array[i] = value;
        //     counter++;
        //   }
        //   System.out.println(Arrays.toString(array));
        // }


        // Другое решение, самое оптимальное.
        for (int i = 0; i < array.length; i++)
            // не тройки по порядку ставим вперед и считаем сколько не троек
            if (array[i] != value)
                array[counter++] = array[i];

        // от количества не троек проставляем до конца тройки
        while (counter < array.length)
            array[counter++] = value;

        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.println(Arrays.toString(array));


    }
}
