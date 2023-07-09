package org.Seminar.Sem_2.core.clients.wild.impl;

import org.Seminar.Sem_2.core.clients.Flyable;
import org.Seminar.Sem_2.core.clients.Runnable;
import org.Seminar.Sem_2.core.clients.owners.Owner;
import org.Seminar.Sem_2.core.clients.wild.WildAnimal;

import java.time.LocalDate;



public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 3 км/ч");
        return 3;
    }

}
