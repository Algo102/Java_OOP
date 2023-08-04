package org.Seminar.Algoritm_Sem1;

public class Zad3 {
    public static void main(String[] args) {
        f(4);
    }

    // Разбираем рекурсию. Ответ 4 3 2 1 1 2 2
    // так как здесь рекурсия, то сложность экспотенциальная
    private static void f(int n) {
        System.out.println(n);
        if(n>=3){
            f(n-1);
            f(n-2);
            f(n-2);
        }
    }
}
