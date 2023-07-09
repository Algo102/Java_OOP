package org.Lecture.Lec_3.Ex004;


import org.Lecture.Lec_3.Ex004.ExBeverage.Coffee;
import org.Lecture.Lec_3.Ex004.ExBeverage.Water;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
