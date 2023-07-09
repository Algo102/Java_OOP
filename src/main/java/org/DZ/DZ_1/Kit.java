package org.DZ.DZ_1;

import org.DZ.DZ_1.Animal;
import org.DZ.DZ_1.Owner;

public class Kit extends Animal {

  public Kit(String id, String name, int age, String color, boolean vaccin, Owner owner) {
    super(id, name, age, color, vaccin, owner);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void toGo(){    
    System.out.println(this.name + " нет ножек, НЕ идет");
  }

  @Override
  public void fly(){
    System.out.println(this.name + " нет крыльев, НЕ летит");
  }

  @Override
  public void swim(){
    super.swim();
  }

  
}
