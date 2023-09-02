package org.DZ.JavaHW1;
import java.util.Scanner;
public class Zad3_Calculytor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Calculator");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter arithmetic operation ");
        String ch = sc.next();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.close();

        double res = 0;
        switch (ch) {
            case "+":
                res  = num1 + num2;
                System.out.println("Your result is: " + res);
                break;

            case "-":
                res  = num1 - num2;
                System.out.println("Your result is: " + res);
                break;

            case "*":
                res  = num1 * num2;
                System.out.println("Your result is: " + res);
                break;

            case "/":
                res  = num1 / num2;
                System.out.println("Your result is: " + res);
                break;

            default:
                System.out.println("You entered an invalid character ((( ");
                break;
        }
    }
}
