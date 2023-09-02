package org.Lecture.Jav_L1;

public class L3_Preobraz {
    public static void main(String[] args) {
        int i = 123; double d = i;
        System.out.println(i); //123
        System.out.println(d); //123.0

        d = 3.145; i = (int)d;
        System.out.println(i); //3.145
        System.out.println(d); //3

        byte b = Byte.parseByte("123");
        System.out.println(b); //123

        b = Byte.parseByte("1234");
        System.out.println(b); //Ошибка переполнения
    }
}
