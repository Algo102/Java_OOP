package org.Lecture.Lec_5.Ex1_Calc;

public class Program {
    public static void main(String[] args) {
        var m = new SumModel();
        var v = new View();
        Presentor p = new Presentor(m, v);
        p.buttonClick();
    }
}
