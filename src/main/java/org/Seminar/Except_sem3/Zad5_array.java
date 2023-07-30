package org.Seminar.Except_sem3;

// 1. Напишите метод на вход которого подаётся двумерный строковый массив
//размером 4х4. При подаче массива другого размера необходимо бросить
//исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать
//в int и просуммировать. Если в каком то элементе массива преобразование
//не удалось (например, в ячейке лежит символ или текст вместо числа),
//должно быть брошено исключение MyArrayDataException с детализацией, в
//какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные
//исключения MyArraySizeException и MyArrayDataException и вывести
//результат расчета (сумму элементов, при условии, что подали на вход
//корректный массив).

public class Zad5_array {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "2", "7", "ddf"},
                {"1", "-5", "ds", "4"},
                {"11", "200", "3", "4"}};
        while (true) {
            try {
                System.out.println("Сумма элементов массива равна: " + sumElementArray(array));
                break;
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
                array[e.getI()][e.getJ()] = "0";
            }
        }
    }

    private static int sumElementArray(String[][] array) {
        int sum = 0;
        int length = 4;
        if (array.length != length) {
            throw new MyArraySizeException(length, array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != length) {
                throw new MyArraySizeException(i, length, array[i].length);
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int item = Integer.parseInt(array[i][j]);
                    sum += item;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }
}
