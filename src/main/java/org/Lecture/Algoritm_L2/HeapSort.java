package org.Lecture.Algoritm_L2;
// Пирамидальная сортировка, работает с бинарной кучей, а у нее нет проблем со
// сложностью n^2, всегда константная сложность
// Сложность O(n*lg n) - самая маленькая сложность для сортировки
public class HeapSort {
    public static void main(String[] args) {

        int[] array = new int[]
                {4, 7, 2, 5, 8, 1, 9, 1, 2, 3, 6};

        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int[] array){
        //построение кучи (перегруппируем массив)
        for (int i = array.length/2-1; i >= 0 ; i--)
            heapify(array, array.length, i);

        // Один за другим извлекаем элементы из кучи
        // Перебираем массив из конца в начало
        for (int i = array.length -1; i >= 0; i--) {
            //Самый большой элемент ставим в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //Вызываем heapify-просеивание на уменьшенной куче, не затрагивая последний элемент
            heapify(array, i, 0);
        }
    }

    //Операция просеивания, и вынесение элемента на верх, если они не являются самыми большими
    private static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex; //инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex +1; // Определяем индексы детей
        int rightChild = 2 + rootIndex + 2;

        //Если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[rightChild] > array[largest])
            largest = leftChild; // largest - становится левым ребенком

        //Если правый доч. элемент больше, чем самый большой элемент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild; // то он становится на место largest

        //Если самый большой элемент не корень
        if(largest != rootIndex){// то совершаем обмен
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            //Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array,heapSize, largest);
        }
    }
}
