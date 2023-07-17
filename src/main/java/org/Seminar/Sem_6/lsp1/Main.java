package org.Seminar.Sem_6.lsp1;

import org.Seminar.Sem_6.lsp1.shape.Rectangle;
import org.Seminar.Sem_6.lsp1.shape.Square;
import org.Seminar.Sem_6.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
