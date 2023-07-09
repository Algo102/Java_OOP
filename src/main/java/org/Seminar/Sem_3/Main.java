package org.Seminar.Sem_3;



import org.Seminar.Sem_3.core.VetClinic;
import org.Seminar.Sem_3.core.clients.Animal;
import org.Seminar.Sem_3.core.clients.animal.home.impl.Bird;
import org.Seminar.Sem_3.core.clients.animal.home.impl.Cat;
import org.Seminar.Sem_3.core.clients.animal.home.impl.Dog;
import org.Seminar.Sem_3.core.clients.animal.wild.impl.Duck;
import org.Seminar.Sem_3.core.clients.animal.wild.impl.Snake;
import org.Seminar.Sem_3.core.clients.animal.wild.impl.WildCat;
import org.Seminar.Sem_3.core.clients.owners.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        Cat homeCat = new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        WildCat wildCat = new WildCat(1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        //homeCat.hunt();
        // wildCat.hunt();

        Dog dog = new Dog();
        //dog.setName("Barbos");
        // System.out.println(homeCat);
        // System.out.println(dog);

        //wildCat.jump();

        Bird bird1 = new Bird(0, null, 0, null, null);
        Cat cat1 = new Cat(0, "Maks", 0, null, null);
        Dog dog1 = new Dog(0, null, 0, null, null);
        Duck duck1 = new Duck(0, 0, null, null);
        Snake snake1 = new Snake(0, 0, null, null);
        WildCat wildCat1 = new WildCat(0, 0, null, null);

        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(homeCat);
        allAnimals.add(wildCat);
        allAnimals.add(dog);
        allAnimals.add(bird1);
        allAnimals.add(cat1);
        allAnimals.add(dog1);
        allAnimals.add(duck1);
        allAnimals.add(snake1);
        allAnimals.add(wildCat1);
        
        VetClinic.runnableAllAnimals(allAnimals);
        System.out.println("------------------------");
        VetClinic.flyableAllAnimals(allAnimals);
        System.out.println("------------------------");
        VetClinic.soundableAllAnimals(allAnimals);
        System.out.println("------------------------");
        VetClinic.swimableAllAnimals(allAnimals);

        
    }
}
