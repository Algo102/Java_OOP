package org.DZ.DZ_7_Caculator.New;

import org.DZ.DZ_7_Caculator.Calculable;
import org.DZ.DZ_7_Caculator.Calculator;
import org.DZ.DZ_7_Caculator.ICalculableFactory;
import org.DZ.DZ_7_Caculator.Log.ConsoleLogger;

public class CalculatorFactoryWithLogger implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
}
