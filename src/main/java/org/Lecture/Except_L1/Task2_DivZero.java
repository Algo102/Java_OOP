package org.Lecture.Except_L1;

public class Task2_DivZero {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));

        // Эта ошибка даже не вышла, т.к. есть другая выше
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divide(int a1, int a2){
        if(a2 == 0){ // Т.к. операция не доходит до конца, исключение
       // программы не получаем, получаем исключение, которое написали сами
            throw new RuntimeException("Divide by zero");
        }
        return a1/a2;
    }

}
