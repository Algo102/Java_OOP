package org.Seminar.Sem_7.Builder.shop;

import org.Seminar.Sem_7.Builder.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final String name;
    private final List<Item> items;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public Shop addItem(Item item) {
        this.items.add(item);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }
}
