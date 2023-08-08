package org.Seminar.Algoritm_Sem2;

import org.Lecture.Algoritm_L2.SearchUtils;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
       int[] array = ArrayUtils.prepareArray();
//        ArrayUtils.printArray(array);
//        SortUtils.directSort(array);
//        ArrayUtils.printArray(array);
//
//        System.out.println();
//
//
//        array = ArrayUtils.prepareArray();
//        ArrayUtils.printArray(array);
//        SortUtils.quickSort(array);
//        ArrayUtils.printArray(array);

//        array = new int[]{5,4,1,0,1};
//        ArrayUtils.printArray(array);
//        SortUtils.quickSort(array);
//        ArrayUtils.printArray(array);

//        array = ArrayUtils.prepareArray(150000);
//        long startTime = System.currentTimeMillis();
//        SortUtils.directSort(array.clone());
//        long endTime = System.currentTimeMillis();
//        System.out.printf("Время работы сортировки ВЫБОРОМ %d мс\n", endTime-startTime);
//
//        array = ArrayUtils.prepareArray(150000);
//        startTime = System.currentTimeMillis();
//        SortUtils.quickSort(array.clone());
//        endTime = System.currentTimeMillis();
//        System.out.printf("Время работы БЫСТРОЙ сортировки %d мс\n", endTime-startTime);
//
//        array = ArrayUtils.prepareArray(150000);
//        startTime = System.currentTimeMillis();
//        Arrays.sort(array.clone());
//        endTime = System.currentTimeMillis();
//        System.out.printf("Время работы СИСТЕМНОЙ сортировки %d мс\n", endTime-startTime);

        array = new int[]{-5,10,4,10,8,7,-9,11,40,90,-100};
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);
        int serchElement = 8;
        int res = SearchUtils.binarySearch(serchElement,array);
        System.out.printf("Элемент %d %s ", serchElement, res>=0 ?
                String.format(" найден в массиве под индексом %d ", res) :
                " не найден в массиве");



    }
}
