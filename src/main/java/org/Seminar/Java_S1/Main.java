package org.Seminar.Java_S1;

public class Main {
    public static void main(String[] args) {
        Task1.run(); // Вызываем метод по имени класса, т.к. в методе стоит static,
        // если убрать static, то будет ошибка, т.к. метод будет принадлежать уже объекту

        Task1 task1 = new Task1(); // Создали экземпляр-объект класса
        // task1.run(); // Так запускается, пока есть static, т.к. метод task1 принадлежит экземпляру

        // Для удобства, чтоб постоянно не создавать объекты, будем пользоваться static,
        // чтоб метод был виден из любого класса программы


        Task5.reverse();
        Task7.write();

        int[] array = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Максимальное количество единиц подряд " + Task2.run(array));


        /**
         * Дан массив двоичных чисел, например [1,1,0,1,1,1],
         * вывести максимальное количество подряд идущих 1.
         */

        // Или так без метода
//        int[] array = { 1, 1, 0, 1, 1, 1 };
//        int count = 0;
//        int current = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                current += 1;
//            } else {
//                if (current > count) {
//                    count = current;
//                }
//                current = 0;
//            }
//        }
//        if (current > count) {
//            count = current;
//        }
//        System.out.println(count);

        //Другой вариант, более долгий, так как 3 if
        // for (int i : array) {
        //   if (i == 1)
        //     current++;
        //   if (count < current)
        //     count = current;
        //   if (i == 0)
        //     current = 0;
        // }
        // System.out.println(count);

    }

}
