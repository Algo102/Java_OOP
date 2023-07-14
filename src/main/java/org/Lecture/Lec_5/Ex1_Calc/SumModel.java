package org.Lecture.Lec_5.Ex1_Calc;

public class SumModel extends CalcModel{

    public SumModel(){

    }

    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
