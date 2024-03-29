package org.Seminar.Sem_2;



import org.Seminar.Sem_2.core.clients.home.impl.Cat;
import org.Seminar.Sem_2.core.clients.home.impl.Dog;
import org.Seminar.Sem_2.core.clients.owners.Owner;
import org.Seminar.Sem_2.core.clients.wild.impl.WildCat;

import java.time.LocalDate;

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

        homeCat.hunt();
        wildCat.hunt();

        Dog dog = new Dog();
        dog.setName("Barbos");
        System.out.println(homeCat);
        System.out.println(dog);
        
    }
}
