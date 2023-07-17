package org.Seminar.Sem_6.lsp2_new.model;

import org.Seminar.Sem_6.lsp2_new.Orderable;

public class OrderBonus extends Orderable {

    public OrderBonus(int quantity, int price) {
        super(quantity, price);
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
