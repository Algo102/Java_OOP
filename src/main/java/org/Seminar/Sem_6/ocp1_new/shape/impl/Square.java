package org.Seminar.Sem_6.ocp1_new.shape.impl;


import org.Seminar.Sem_6.ocp1_new.shape.Shape;

public class Square  implements Shape {
    private final int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
            return Math.pow(getSide(), 2);
    }
}
