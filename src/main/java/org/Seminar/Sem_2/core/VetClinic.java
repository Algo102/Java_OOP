package org.Seminar.Sem_2.core;

import org.Seminar.Sem_2.core.clients.Animals;
import org.Seminar.Sem_2.core.clients.Human;
import org.Seminar.Sem_2.core.clients.home.impl.Cat;

import java.util.ArrayList;
import java.util.List;



public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();
    public static void main(String[] args) {
        Human human = new Human("Пайтон");
        Cat cat = new Cat(0, null, 0, null, null);
        // Так создали интерфейс Анималс и имплементировали в WildAnimals и Pet, для того чтоб только их можно было лечить, соответственно лечить людей больше не можем
        //animals.add(human);
        animals.add(cat);
        for (Animals element: animals) {
            heal(element);
        }    
    }
    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + " вылечен");
    }  
}

