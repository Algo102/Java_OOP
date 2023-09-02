package org.Lecture.Jav_L1;

public class L8_Konstrukcii {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;

        if (a > b)
            c = a;
        else
            c = b;

        // Тоже самое
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);

        // Или так, с тернарным оператором
        // Если условие выполняется, то будет а, если нет то б
        int min = a < b ? a : b;
        System.out.println(min);
    }
}
