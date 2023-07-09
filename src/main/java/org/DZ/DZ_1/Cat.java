package org.DZ.DZ_1;

public class Cat extends Animal{

  public Cat(String id, String name, int age, String color, boolean vaccin, Owner owner) {
    super(id, name, age, color, vaccin, owner);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void toGo(){
    super.toGo();
  }

  @Override
  public void fly(){
    System.out.println(this.name + " нет крыльев, НЕ летит");
  }

  @Override
  public void swim(){
    System.out.println(this.name + " боится воды, НЕ плывет");
  }




  


  
}
