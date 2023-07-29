package org.DZ.Except_DZ2;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Hw1_float {
    public static void main(String[] args) {
        inputFloat();
    }

    public static void inputFloat(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a fractional number ");
            try {
                float number = Float.parseFloat(sc.next());
                System.out.println(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter numbers. Try again");
            }
        }
    }
}
