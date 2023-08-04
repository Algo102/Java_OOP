package org.Lecture.Algoritm_L2;

public class Find {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(find(array, 5));
//
//        System.out.println(binarySearch(array, 5, 0, array.length-1));
        //Запись после перегрузки метода
        System.out.println(binarySearch(array, 5));
        // Для проверки работоспособности, обычно вводят крайние элементы
        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 9));
        //System.out.println(binarySearch(array, 99));

    }

    // Обычным поиск перебором
// Так как используем 1 цикл for, то сложность будет O(n)
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1; //Если ни чего не найдено, то -1
    }

    // Иногда проще сделать просто перебор и не сортировать предварительно, все
    // зависит от задачи, к примеру, элемент нужно найти 1 раз

    // Бинарный поиск. Берем любой элемент из середины ОТСОРТИРОВАННОГО массива
    // т.е. сравнивая этот элемент с искомым, мы гарантированно отсеиваем половину
    // массива. Сложность O(lg n). Производительность очень хорошая, т.к. даже если
    // массив будет в два раза больше, алгоритм увеличиться на 1 операцию
    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint; // переменная для середины
        if (max < min) {
            return -1; // на тот случай, если уже некуда сдвигаться, на новом отрезке
        } else {
            midPoint = (max - min) / 2 + min; //вычисление середины отрезка
        }
        //определяем, какую половину будем обрабатывать, относительно середины
        if (array[midPoint] < value) {//если значение в середине меньше искомого
            // то берем отрезок правый, т.е. середина+1 и до конца
            return binarySearch(array, value, midPoint + 1, max);
        } else {// в противном случае
            if (array[midPoint] > value) {//если значение в середине больше искомого
                // то берем отрезок левый, т.е. от минимума до середина-1
                return binarySearch(array, value, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }

    // Перегружаем функцию с бинарным поиском, чтоб вместе на месте вызова не писать
    // полноценную функцию, со всеми аргументами
    public static int binarySearch(int[] array, int value){
        return binarySearch(array, value, 0, array.length-1);
    }


}
