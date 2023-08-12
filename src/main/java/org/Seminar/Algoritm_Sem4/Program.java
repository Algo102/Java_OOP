package org.Seminar.Algoritm_Sem4;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("AAA");
//        list1.add("BBB");

        // Хэш таблица предназначена для хранения пар: ключ, значение
        // Ключ должен быть уникальным
        // При создании нельзя использовать примитивные типы, только классы обертки
//        HashMap<Integer, String> hm1 = new HashMap<>();
//        hm1.put(12, "AAA");
//        hm1.put(12, "BBB"); // Замена новым значением по ключу 12
//
//        Employee employee1 = new Employee("AAAA", 32);
//        System.out.println(employee1.hashCode()); // 250421012 HashCode
//
//        Employee employee2 = new Employee("BBBB", 32);
//        System.out.println(employee2.hashCode()); // 1915318863
        // Иногда для разных объектов, будут встречаться одинаковые функции - колизии

        //HashMap<Integer, String> hm1 = new HashMap<>(4);
        HashMap<String, String> hm1 = new HashMap<>(4);
//        hm1.put("+7925963","AAAA");
//        hm1.put("+792745","MMM");
//        hm1.put("+7925616","BBBB");
//        hm1.put("+7925616","CCC");
        String oldValue = hm1.put("+7925963","AAAA");
        oldValue = hm1.put("+792745","MMM");
        oldValue = hm1.put("+7925616","BBBB");
        oldValue = hm1.put("+7925616","CCC");
        oldValue = hm1.put("+7925626","CCC1");
        oldValue = hm1.put("+7925636","CCC2");
        oldValue = hm1.put("+7925646","CCC3");
        oldValue = hm1.put("+7925656","CCC4");
        oldValue = hm1.put("+7925666","CCC5");
        oldValue = hm1.put("+7925676","CCC6");
        oldValue = hm1.put("+7925686","CCC7");

        String res1 = hm1.get("+7925686");
        String res2 = hm1.get("+1115686");

        String res3 = hm1.remove("+7925656");
        String res4 = hm1.remove("+7925666");
        String res5 = hm1.remove("+7925666");

        System.out.println(hm1);






    }
}
