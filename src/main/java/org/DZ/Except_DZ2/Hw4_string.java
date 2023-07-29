package org.DZ.Except_DZ2;

import java.util.Scanner;

public class Hw4_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите че нидь ");
        String str = sc.nextLine();
        if(str.isEmpty()){
            throw new RuntimeException("Ввод не должен быть пустым");
        }
        System.out.println("Вы ввели " + str);
    }
}
