package org.Seminar.Sem_7.DecoratorFactory.New;

import org.Seminar.Sem_7.DecoratorFactory.Calculable;
import org.Seminar.Sem_7.DecoratorFactory.Calculator;
import org.Seminar.Sem_7.DecoratorFactory.ICalculableFactory;
import org.Seminar.Sem_7.DecoratorFactory.Log.ConsoleLogger;

public class CalculatorFactoryWithLogger implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
}
