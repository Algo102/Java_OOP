package org.Seminar.Sem_7.DecoratorFactory.New;

import org.Seminar.Sem_7.DecoratorFactory.Calculable;
import org.Seminar.Sem_7.DecoratorFactory.Log.Logger;

public class CalculatorDecorator implements Calculable {
    private Calculable calculator;
    private Logger logger;

    public CalculatorDecorator(Calculable calculable, Logger logger) {
        this.calculator = calculable;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Вычисляем сумму %s c %s", arg, calculator.getResult()));
        Calculable result = calculator.sum(arg);
        logger.log(String.format("Результат: %d", result.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Умножаю %s c %s", arg, calculator.getResult()));
        Calculable result = calculator.multi(arg);
        logger.log(String.format("Результат: %d", result.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
