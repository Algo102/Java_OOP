package org.DZ.DZ_1;



import java.util.ArrayList;



// Дз: добавить в класс Animal публичные методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса наследника Animal, умеющих летать, плавать, бегать, но не все наследники умеют летать и плавать. Добейтесь того, чтобы наследники, которые, например, не умеют летать, - не могли этого делать.


public abstract class Animal {
    protected String id;
    protected String name;
    protected int age;    
    protected String color;
    protected boolean vaccin;    
    protected Owner owner;

    private static int Index; // Индекс для нумерации
    private static ArrayList<String> ids; // Коллекция имен

    static {
    Index = 1; // Начальный индекс 1
    ids = new ArrayList<String>(); // Инициализируем пустую коллекцию
  }
    

    public Animal(String id, String name, int age, String color, boolean vaccin, Owner owner){      
      this.id = String.format("id_%d", Index++);
      Animal.ids.add(this.id);
      this.name = name;
      this.age = age;
      this.color = color;
      this.vaccin = vaccin;
      this.owner = owner;
    }

    @Override
    public String toString() {    
    return String.format("%s, Name: %s, Возраст: %d, Цвет: %s, Вакцина: %s, Хозяин: %s", this.id, this.name, this.age, this.color, this.vaccin, this.owner);
    } 
    
    public void toGo(){
      System.out.println(this.name + " бежит");
    }

    public void fly(){
      System.out.println(this.name + " летит");
    }

    public void swim(){
      System.out.println(this.name + " плывет");
    }




  
}
