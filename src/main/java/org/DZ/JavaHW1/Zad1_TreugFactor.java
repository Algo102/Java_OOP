package org.DZ.JavaHW1;
import java.util.Arrays;
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел
// от 1 до n)
import java.util.Scanner;

public class Zad1_TreugFactor {
    static int treug(int n){
        if(n==1)
            return 1;
        return n + treug(n - 1);
    }

    static int factor(int n){
        if(n==1)
            return 1;
        return n * factor(n - 1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Пограмма для просчета n-треугольного числа и факториала");
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.printf("Треугольное число от %d, равно %d: ", num , treug(num));
        System.out.printf("Факториал числа %d, равен %d: ", num , factor(num));



        //Через цикл треугольное число
        // int sum = 0;
        // int[] array = new int[num];
        // for (int i = 0; i < array.length; i++) {
        //   array[i] = i+1;
        //   sum += array[i];
        // }
        // System.out.println(Arrays.toString(array));
        // System.out.println(sum);
    }
}
