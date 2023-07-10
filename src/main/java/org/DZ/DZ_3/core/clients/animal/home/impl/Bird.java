package org.DZ.DZ_3.core.clients.animal.home.impl;

import org.DZ.DZ_3.core.clients.actionsAnimal.Flyable;
import org.DZ.DZ_3.core.clients.owners.Owner;
import org.DZ.DZ_3.core.clients.actionsAnimal.specifics.Sings;
import org.DZ.DZ_3.core.clients.animal.home.Pet;

import java.time.LocalDate;



public class Bird extends Pet implements Flyable, Sings {
  public Bird() {
    }

  public Bird(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
    super(id, name, numberOfLimbs, registrationDate, owner);
  }

  @Override
  public int fly() {
    System.out.println(CLASS_NAME + "летит со скоростью: 12 км/ч");
        return 12;
  }

  @Override
  public int sound() {
    System.out.println(CLASS_NAME + "щебечет: 2 раза");
        return 2;
  }

  @Override
  public int sing() {
    System.out.println(CLASS_NAME + "поет: 1 раза");
        return 1;
  }




}
