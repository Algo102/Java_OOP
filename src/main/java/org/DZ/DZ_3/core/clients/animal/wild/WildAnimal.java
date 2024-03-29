package org.DZ.DZ_3.core.clients.animal.wild;



import org.DZ.DZ_3.core.clients.Animal;
import org.DZ.DZ_3.core.clients.owners.Owner;
import org.DZ.DZ_3.core.clients.Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 Абстракция дикого животного
 */
public class WildAnimal extends Animal implements Animals {
    public WildAnimal() {
    }

    protected WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
