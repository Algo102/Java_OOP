package org.Seminar.Except_sem3;

public class MyArrayDataException extends IllegalArgumentException{
    private int i;
    private int j;
    public MyArrayDataException(int i, int j) {
        super("Элемент под индексом [" + i + ", " + j + "] не возможно преобразовать в число");
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
