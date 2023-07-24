package org.DZ.DZ7_Caculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
