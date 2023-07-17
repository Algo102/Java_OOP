package org.Seminar.Sem_6.lsp2_new.model;

import org.Seminar.Sem_6.lsp2_new.Orderable;

public class Order extends Orderable {

    public Order(int price, int quantity) {
        super(price, quantity);
    }

    @Override
    public double getAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", quantity, price);
    }
}
