package org.DZ.DZ_7_Caculator;

import org.DZ.DZ_7_Caculator.New.CalculatorFactoryWithLogger;

public class Main {
    public static void main(String[] args) {

        ICalculableFactory calculableFactory = new CalculatorFactoryWithLogger();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
