package org.Seminar.Sem_6.lsp1_new.shape;

public class Rectangle extends QudroLiteral {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
//        this.setSideA(sideA);
//        this.setSideB(sideB);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }
}
