package org.Seminar.Sem_6.lsp1_new;

import org.Seminar.Sem_6.lsp1_new.shape.Rectangle;
import org.Seminar.Sem_6.lsp1_new.shape.Square;
import org.Seminar.Sem_6.lsp1_new.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        //square.setSide(4);
        System.out.printf("In a square side A = %d\n", square.getSide());
        //System.out.printf("In a rectangle side A = %d, side B = %d\n", square.getSideA(), square.getSideB());
        ShapeView view = new ShapeView(square);
        view.showArea();

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view1 = new ShapeView(rectangle);
        view1.showArea();
    }
}
