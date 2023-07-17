package org.Seminar.Sem_6.lsp2_new.util;


import org.Seminar.Sem_6.lsp2_new.Orderable;
import org.Seminar.Sem_6.lsp2_new.model.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<Orderable> {
    private List<Orderable> orders = new ArrayList<>();

    public void add(Orderable order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (Orderable order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Orderable> iterator() {
        return orders.iterator();
    }
}
