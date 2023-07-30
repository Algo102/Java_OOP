package org.Seminar.Except_sem3;

public class MyArraySizeException extends IllegalArgumentException{
    int length;
    int realLength;
    public MyArraySizeException(int length, int realLength) {
        super("Ожидается длина массива " + length + ". Фактическая длина " + realLength);
        this.length = length; // эти не обязательны, добавили на всякий случай для геттеров
        this.realLength = realLength;
    }

    public MyArraySizeException(int i, int length, int realLength) {
        super("Ожидается длина массива " + length + ". Фактическая длина массива под индексом " + i
                + " равна " + realLength);
        this.length = length; // эти не обязательны, добавили на всякий случай для геттеров
        this.realLength = realLength;
    }

    public int getLength() {
        return length;
    }

    public int getRealLength() {
        return realLength;
    }
}
