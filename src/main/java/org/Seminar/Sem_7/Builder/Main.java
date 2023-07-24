package org.Seminar.Sem_7.Builder;

import org.Seminar.Sem_7.Builder.item.Characteristic;
import org.Seminar.Sem_7.Builder.item.impl.Laptop;

public class Main {
    public static void main(String[] args) {

        Characteristic feature = Characteristic.builder()
                .brand("Apple")
                .color("Red")
                .ram("256")
                .build();
        Laptop laptop = new Laptop(feature);
    }
}
