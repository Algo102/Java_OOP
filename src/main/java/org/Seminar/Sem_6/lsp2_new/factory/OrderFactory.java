package org.Seminar.Sem_6.lsp2_new.factory;


import org.Seminar.Sem_6.lsp2_new.Orderable;
import org.Seminar.Sem_6.lsp2_new.model.Order;
import org.Seminar.Sem_6.lsp2_new.model.OrderBonus;

public class OrderFactory {
    public Orderable create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
