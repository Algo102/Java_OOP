package org.Lecture.Lec_5.Ex1_Calc;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    // принимает текст, распечатывает и получает число
    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(int data, String title){
        System.out.printf("%s %d\n", title, data);
    }

}
