package org.Lecture.Jav_L1;

public class L5_FormatPr {
    public static void main(String[] args) {
        String s = "qwe";
        int e = 123;
        String q = s + e; // конкатинация строк, очень ресурсозатратная операция,
        // если все это в большом цикле, в этом примере заняло 4 ячейки памяти
        System.out.println(q); // qwe123


        int a = 1, b = 2;
        int c = a + b;
        // String res = a + " + " + b + " = " + c;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.println(res); // 1+2=3
        System.out.printf("%d + %d = %d \n", a, b, c);

        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00

    }
}
