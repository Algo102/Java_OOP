package org.DZ.DZ_3.core.clients.animal.wild.impl;

import org.DZ.DZ_3.core.clients.actionsAnimal.specifics.Crawling;
import org.DZ.DZ_3.core.clients.owners.Owner;
import org.DZ.DZ_3.core.clients.animal.wild.WildAnimal;

import java.time.LocalDate;



public class Snake extends WildAnimal implements Crawling {
  public Snake() {
    }

    public Snake(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
      System.out.println(CLASS_NAME + "Не умею бегать, зато умею ползать");
        return 0;
    }

    @Override
    public int crawl() {
      System.out.println(CLASS_NAME + "ползает со скоростью 1 км/ч");
        return 1;
    }

}
