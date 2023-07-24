package org.Seminar.Sem_7.Builder.item.impl;


import org.Seminar.Sem_7.Builder.item.Characteristic;
import org.Seminar.Sem_7.Builder.item.Item;

public class Bike implements Item {
    private final Characteristic characteristic;

    public Bike(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
