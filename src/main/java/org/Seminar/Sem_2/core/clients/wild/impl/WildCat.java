package org.Seminar.Sem_2.core.clients.wild.impl;



import org.Seminar.Sem_2.core.clients.Runnable;
import org.Seminar.Sem_2.core.clients.owners.Owner;
import org.Seminar.Sem_2.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "Бегает со скоростью 15 км/ч");
        return 15;
    }
}
