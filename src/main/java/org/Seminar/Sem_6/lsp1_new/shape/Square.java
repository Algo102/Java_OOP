package org.Seminar.Sem_6.lsp1_new.shape;

public class Square extends QudroLiteral {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(this.side, 2);
    }
}
