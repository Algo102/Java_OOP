package org.Seminar.Sem_6.srp1;

import org.Seminar.Sem_6.srp1.figure.Point;
import org.Seminar.Sem_6.srp1.figure.Square;


public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        square.draw();
    }
}
