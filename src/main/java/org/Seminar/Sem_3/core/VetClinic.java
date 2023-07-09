package org.Seminar.Sem_3.core;

import org.Seminar.Sem_3.core.clients.Animal;
import org.Seminar.Sem_3.core.clients.Animals;
import org.Seminar.Sem_3.core.clients.Human;
import org.Seminar.Sem_3.core.clients.actionsAnimal.Flyable;
import org.Seminar.Sem_3.core.clients.actionsAnimal.Soundable;
import org.Seminar.Sem_3.core.clients.actionsAnimal.Swimable;
import org.Seminar.Sem_3.core.clients.animal.home.impl.Cat;

import java.util.ArrayList;
import java.util.List;



public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();

    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + " вылечен");
    } 

    
    public static void runnableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Runnable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }

    public static void flyableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Flyable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }

    public static void soundableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Soundable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }

     public static void swimableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Swimable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }
  
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
 
}

