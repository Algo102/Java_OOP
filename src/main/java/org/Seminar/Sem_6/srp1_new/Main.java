package org.Seminar.Sem_6.srp1_new;

import org.Seminar.Sem_6.srp1_new.figure.Point;
import org.Seminar.Sem_6.srp1_new.figure.Square;
import org.Seminar.Sem_6.srp1_new.figure.SquareAreaCalculator;
import org.Seminar.Sem_6.srp1_new.figure.SquarePainter;


public class Main {
    public static void main(String[] args) {
        SquarePainter squarePainter = new SquarePainter();
        SquareAreaCalculator squareAreaCalculator = new SquareAreaCalculator();
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", squareAreaCalculator.getArea(square));
        squarePainter.draw(square);
    }
}
