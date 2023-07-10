package org.DZ.DZ_3.core.drugStore;

import org.DZ.DZ_3.core.personal.Doctor;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Pharmacy pharmacy1 = new Pharmacy();
    Component comp1 = new Component("Pinicilin", "10 mg", 10);
    Component comp2 = new Component("Spirit", "100 g", 1000);
    pharmacy1.addComponet(comp1).addComponet(comp2);

    //Выводим в консоль все компоненты одного лекарства
    //System.out.println(pharmacy1);
    //System.out.println("--------------");
    //Выводим перечень через встроенный Iterator
//    while (((Iterator <Component>) pharmacy1).hasNext()){
//      System.out.println(pharmacy1.next());
//    }

//        DogPharmacy dogPharmacy = new DogPharmacy();
//        System.out.println(dogPharmacy.hashCode());

    // Поменяли на встроенный интерфейс Itarable, конструкция гораздо проще
//    for (Component elem: pharmacy1) {
//      System.out.println(elem);
//    }


    Pharmacy pharmacy2 = new Pharmacy();
    Component comp3 = new Component("Pinicilin", "10 mg", 3);
    Component comp4 = new Component("Spirit", "100 g", 13);
    pharmacy2.addComponet(comp3).addComponet(comp4);

    Pharmacy pharmacy3 = new Pharmacy();
    Component comp5 = new Component("Pinicilin", "10 mg", 12);
    Component comp6 = new Component("Spirit", "100 g", 100);
    pharmacy3.addComponet(comp5).addComponet(comp6);

    Pharmacy pharmacy4 = new Pharmacy();
    pharmacy4.addComponet(comp1).addComponet(comp2);

    Pharmacy pharmacy5 = new Pharmacy();
    Component comp7 = new Component("Viriculinxa", "10 mg", 10);
    pharmacy5.addComponet(comp7).addComponet(comp2);

    List<Pharmacy> nomenclature = new ArrayList<>();
    nomenclature.add(pharmacy3);
    nomenclature.add(pharmacy1);
    nomenclature.add(pharmacy2);
    //nomenclature.add(pharmacy4);
    nomenclature.add(pharmacy5);

    //System.out.println(nomenclature);

    Collections.sort(nomenclature);
    //System.out.println("--------------");
    //System.out.println(nomenclature);


//    Serializable - этот интерфейс пустой без методов, он трансформирует объект в байты, передает по сети,
//    и после быстрой передачи этот объект можно собрать сново

    // К примеру нужно сделать перепись всех объектов из разных отраслей, аналогично создаем пустой интерфейс маркер
    // имплиментируем в те классы, чьи объекты нам нужны, создаем список от этого интерфейса
//    List<Marker> markers = new ArrayList<>();
//    Doctor doc1 = new Doctor();
//    markers.add(doc1);
//    markers.add(pharmacy1);
//    System.out.println(markers);

    Set<Pharmacy> result = new HashSet<>();
    result.add(pharmacy3);
    result.add(pharmacy1);
    result.add(pharmacy2);
    System.out.println("--------------Original list Lenght = "+result.size()+"----------");
    System.out.println(result);

    result.add(pharmacy4);
    System.out.println("------------Added pharmacy Full analog-------------");
    System.out.println(pharmacy4);

    System.out.println("-------------Lenght after adding = "+result.size()+"-----------");
    System.out.println(result);

    System.out.println("--------Added pharmacy with another name of the component-------");
    System.out.println(pharmacy5);
    System.out.println(nomenclature);


  }
}
