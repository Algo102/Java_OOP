package org.Seminar.Sem_6.lsp2_new;


import org.Seminar.Sem_6.lsp2_new.factory.OrderFactory;
import org.Seminar.Sem_6.lsp2_new.model.Order;
import org.Seminar.Sem_6.lsp2_new.util.OrderCalculator;

public class Main {
    public static void main(String[] args) {
        OrderFactory creator = new OrderFactory();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Orderable order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Order sum %d", calculator.calcAmount());
    }
}
