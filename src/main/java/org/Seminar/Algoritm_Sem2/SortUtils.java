package org.Seminar.Algoritm_Sem2;

public class SortUtils {
    // Сортировка ВЫБОРОМ. Высокая сложность О(n^2)
    // Принимаем первый элемент за минимум и сравниваем каждый последующий с
    // ним, если другой меньше, то меняем местами
    public static void directSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int saveIndex = i; // фиксируем индекс
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[saveIndex]){
                    saveIndex = j;
                }
            }
            if (saveIndex!= i){
                int buf = array[i];
                array[i] = array[saveIndex];
                array[saveIndex] = buf;

                //можно поменять значения у переменных не вводя буфер
//                a = a+b // a=15
//                b = a-b // b=5
//                a = a-b // a=10
            }
        }
    }

    // Перегрузили метод, чтоб оставить один рабочий, а основной метод
    // сделали приватным и будем его считать служебным
    // В зависимости от изначального порядка элементов сложность меняется
    // В худш.случае O(n^2), в лучш.случ O(n), в станд. режиме O(n*lg n)
    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }
    public static void quickSort(int[] array, int start, int end){
        int left = start;
        int right = end;
        int middle = array[(start+end)/2];

        do {
            while (array[left] < middle){
                left++;
            }

            while (array[right] > middle){
                right--;
            }

            if(left<=right){
                if (left<right){
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        }
        while (left<=right);

        if(left<end){
            quickSort(array, left, end);
        }
        if (start<right){
            quickSort(array,start,right);
        }



    }
}
