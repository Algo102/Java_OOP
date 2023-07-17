package org.Seminar.Sem_6.lsp2;


import org.Seminar.Sem_6.lsp2.factory.OrderFactory;
import org.Seminar.Sem_6.lsp2.model.Order;
import org.Seminar.Sem_6.lsp2.util.OrderCalculator;

public class Main {
    public static void main(String[] args) {
        OrderFactory creator = new OrderFactory();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Order order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Order sum %d", calculator.calcAmount());
    }
}
