package org.Lecture.Jav_L1;

import java.util.Scanner;

public class L9_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer value = sc.nextInt();

        int mounth = value;
        String text = "";

        switch (mounth) {
            case 1: // При выборе от 1 до 5, все равно будет выполнен 5
            case 2:
            case 3:
            case 4:
            case 5:
                text = "Autumn";
                break;

            default: // Необязательная ветка
                text = "mistaka";
                break;
        }
        System.out.println(text);
        sc.close();
    }
}
