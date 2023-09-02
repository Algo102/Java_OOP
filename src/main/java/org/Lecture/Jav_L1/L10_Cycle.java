package org.Lecture.Jav_L1;

public class L10_Cycle {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);


        // Цикл do while.  Сначала 1 раз делает, потом проверяет
        // Конкретно для этой задачи разницы нет
        int value1 = 321;
        int count1 = 0;

        do{
            value1 /= 10;
            count1++;
        }
        while (value1 != 0);
        System.out.println(count1);


        // Цикл ФОР
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Если ИФ выполнился, то вернись к ФОР и вернись обратно, если нет то идет на принт
                // break; // После нахождения первого нужного условия выходит из ближайшего цикла
            }
            System.out.println(i);
        }


        for (int i = 0; i < 10; i++) {
            // break; // можно и тут писать
            for (int j = 0; j < 5; j++) {
                break; // Этот бреак прервет только внутренний ФОР
            }
            break; // Прервет основной ФОР
        }

        // continue и break  не рекомендуется использовать, только в крайних случаях, так же как и отсылку goto

        // вложенные циклы, можно делать любой глубины
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *


        // FORICH
        // Нужен для работы для перебора- чтение, в основном коллекции
        // В данном случае массив, а он в частном случае является коллекцией
        int[] arr = new int[] {1,2,3,4,5,77};
        for (int item : arr) {
            System.out.println(item);
        }


    }
}
