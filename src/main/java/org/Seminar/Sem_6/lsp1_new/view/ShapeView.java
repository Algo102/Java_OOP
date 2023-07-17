package org.Seminar.Sem_6.lsp1_new.view;


import org.Seminar.Sem_6.lsp1_new.shape.QudroLiteral;
import org.Seminar.Sem_6.lsp1_new.shape.Rectangle;
import org.Seminar.Sem_6.lsp1_new.shape.Square;

public class ShapeView {
    private final QudroLiteral qudroLiteral;

    public ShapeView(Square qudroLiteral) {
        this.qudroLiteral = qudroLiteral;
    }

    public ShapeView(Rectangle qudroLiteral) {
        this.qudroLiteral = qudroLiteral;
    }

    public void showArea() {
        System.out.print("Area of qudroLiteral equal:");
        System.out.println(qudroLiteral.getArea());
    }
}
