package org.DZ.Except_DZ2;

public class Hw2_1_zero {
    public static void main(String[] args) {
        int[] intArray = {12,13,15,4,8,9,5,6, 10};
        int d = 1;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Указан индекс за пределами массива");
        }catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }



}
