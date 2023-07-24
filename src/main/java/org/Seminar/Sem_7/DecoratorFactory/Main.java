package org.Seminar.Sem_7.DecoratorFactory;

import org.Seminar.Sem_7.DecoratorFactory.New.CalculatorFactoryWithLogger;

// Создать логирование операций, для класса Calculator.
// Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        //ICalculableFactory calculableFactory = new CalculableFactory();
        //ViewCalculator view = new ViewCalculator(calculableFactory);
        //view.run();
        ICalculableFactory calculableFactory1 = new CalculatorFactoryWithLogger();
        ViewCalculator view = new ViewCalculator(calculableFactory1);
        view.run();
    }
}
