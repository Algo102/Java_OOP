package org.DZ.Excep_DZ1;



public class Hw1 {
    public static void main(String[] args) {
        Answ ans = new Answ();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

class Answ {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[]{0};
        array[2] = 5;

    }

    public static void divisionByZero() {
        int a = 5, b = 0;
        int c = a / b;

    }

    public static void numberFormatException() {
        String str = "Jon";
        int b = Integer.parseInt(str);


    }
}