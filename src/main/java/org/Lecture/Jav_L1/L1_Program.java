package org.Lecture.Jav_L1;

/**
 *
 */

public class L1_Program {
    public static void main(String[] args) {
        System.out.println("bye world");

        double f = 123.45;
        double f1 = 123.45d; // d необязательно
        float d = 321.54f; // f обязательно

        char ch = '{';
        System.out.println(ch);
        char ch1 = 123; // { - Символ по коду, не явное преобразование
        System.out.println(ch1);

        int a = 13;
        double b = a; // int в double помещается т.к. у int 4 байта, а у double 8. Наоборот без преобразования не получится

        char ch2 = '1';
        System.out.println(Character.isDigit(ch2)); // true
        ch2 = 'a';
        System.out.println(Character.isDigit(ch2)); // false


        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false //дизьюнкция, когда строго одна true

        boolean e = true && false;
        System.out.println(e); //согласно таблице истинности false

        boolean e1 = true ^ false;
        System.out.println(e1); //дизьюнкция, когда строго одна true


        String msg = "Hello"; // строки не примитивный тип. 1 символ 2 байта
        System.out.println(msg);


        // var k = 123; // Не явная типизация
        // System.out.println(k);
        // System.out.println(getType(k)); // вызываем метод Intger

        // var k1 = 123.456;
        // System.out.println(getType(k1)); // Double

        // У классов оберток, есть полноценный дополнительный функционал
        System.out.println(Integer.MAX_VALUE); // При вводе Integer. выходит выбор разного функционала

        String s = "qwer";
        s.charAt(1); // Даст первый символ w
        s.length(); // длина строки - вызываем метод length

        // Большие числа можно разделять подчеркиванием
        int t = 23_656_789;


        int i = 123;
        i++;
        System.out.println(i); //124
        System.out.println(i++); //124. Операция вывода в приоритете, чем постфиксный инкримент
        System.out.println(i); //125
        System.out.println(++i); //126. Если постфиксный инкримент, то приоритет выше чем вывод

        int i1 = 100;
        //i1 = --i1 - i1--; //99 - 99 = 0
        i1 = i1-- - --i1; //100-98????
        System.out.println(i1);


        //Побитовые операции
        int g = 8; // 1000
        //g = g << 1; // двигаем биты на 1 влево
        // или так сразу, одинаково
        System.out.println(g << 1); // 10000, т.е. 16

        int g1 = 18; // 10010
        //g1 = g1 >> 1; двигаем биты на 1 враво
        // или так сразу, одинаково
        System.out.println(g1 >> 1); // 1001, т.е. 9

        int c = 5;
        int c1 = 2;
        System.out.println(c | c1); // 5 или 2 = 7
        // 101
        // 010
        // 111 = 7

        System.out.println(c & c1);
        // 101
        // 010
        // 000 = 0

        System.out.println(c ^ c1); // Разделительное или. Истина тогда когда только одна истина
        // 101
        // 010
        // 111 = 7


        String s1 = "qww1"; // 4, 0..3
        // т.к. && проверка закончится после первого условия и нет смысла смотреть дальше,
        // длина строки больше или равно 5 (false) и четвертый символ = 1
        boolean b1 = s1.length() >= 5 && s1.charAt(4) == '1';
        // т.к. & обязательно будут проверяться все условия
        //boolean b1 = s1.length() >= 5 & s1.charAt(4) == '1';
        System.out.println(b1);

    }

    // любой метод д.б. частью класса
    // Статический метод класса
    static String getType(Object o){
        return o.getClass().getSimpleName(); // Вызываем метод getClass и запрашиваем имя класса
    }
}
