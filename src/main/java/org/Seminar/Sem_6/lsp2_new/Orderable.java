package org.Seminar.Sem_6.lsp2_new;

public abstract class Orderable {

    protected final int price;
    protected final int quantity;

    public Orderable(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double getAmount();

    @Override
    public String toString() {
        return "Orderable{" +
                "price=" + price +
                ", quantity=" + quantity +
                '}' + " it's a bonus";
    }
}
