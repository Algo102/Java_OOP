package org.Lecture.Jav_L1;

public class L6_Vidimost {
    static int t = 123; // будет доступна везде, но только через имя класса(глобальная переменная)

    public static void main(String[] args) {

        // int a = 123;
        // System.out.println(a);

        int b = 111;
        {
            // так не получиться, т.к уже а в основном блоке определена, поэтому выше закоментировал.
            // То что открыто внутри, снаружи не доступно
            int a = 123;
            System.out.println(a);

            // в то же время можем обращаться к переменным, которые открыты выше
            System.out.println(b);


        }

        // System.out.println(a); // будет ошибка, т.к. открыта внутри

        // а так получиться, т.к. а была открыта во внутреннем блоке и уже закрыта
        int a = 222;
        System.out.println(a);

    }
}
