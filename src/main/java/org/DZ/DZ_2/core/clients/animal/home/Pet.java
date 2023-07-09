package org.DZ.DZ_2.core.clients.animal.home;



import org.DZ.DZ_2.core.clients.Animal;
import org.DZ.DZ_2.core.clients.Animals;
import org.DZ.DZ_2.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
