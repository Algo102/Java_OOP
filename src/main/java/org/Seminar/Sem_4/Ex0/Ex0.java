package org.Seminar.Sem_4.Ex0;

import org.Seminar.Sem_3.core.clients.Animal;
import org.Seminar.Sem_3.core.clients.animal.home.impl.Cat;

import java.util.ArrayList;
import java.util.List;

public class Ex0 {
    public static void main(String[] args) {
        // Так создавался лист до 5 Java, и туда можно было пихать все что угодно.
        // Было до появления Джинериков и называлась сырые типы
//        List list = new ArrayList<>();
//        list.add(1);
//        list.add(true);
//        list.add("sddsfbdsfb");
//
//        for (Object o: list) {
//            System.out.println(o);
//        }
            // Безпроблем все вывелось,
//        1
//        true
//        sddsfbdsfb
            //System.out.println(((String) o).length()); // ошибки не подчеркивает
            // но упадет если выводить длину, через кастование к строке, ошибки не
            // видит, т.к. все это Object, и не видит длину true и Integer.
            // Через метод toString это уже другой подход
//            System.out.println((o + "").length());
            // а вот так все привелось к строке и вывелось
//            1
//            4
//            10


        // То есть программист мог ошибиться и впихнуть разные типы в список и не увидеть ошибку,
        // а через промежуток времени, может вылезти не понятно откуда ошибка,
        // поэтому ввели Джинерики.
        // Важно. Эти типы нужны больше для нас чтоб не допустить ошибку в момент написания кода,
        // но в момент компиляции ява работает с Object
//        List<String> list1 = new ArrayList<>();
//        // list1.add(1); // Компилятор видит что это не строка и подчеркивает
//        list1.add("1");
//        // list1.add(true);
//        list1.add("true");
//        list1.add("sddsfbdsfb");
//
//        for (Object o: list1) {
//            System.out.println(((String) o).length()); // без проблем
//        }


        // Такая более правильная, чем если бы вместо вопроса написали Object, т.к.
        // получился бы тот же самый сырой тип. Т.е. ждем коллекцию но не знаем какую
//        List<?> list2 = new ArrayList<>();
//        for (Object o: list2) {
//            System.out.println(((String) o).length()); // так без проблем
//        }
        
        // А с помощью вопроса можно поставить ограничения по спискам.
        // К примеру, создадим метод который будет выводить на печать любые, 
        // но заранее оговоренные списки
        List<Float> list3 = new ArrayList<>();
        list3.add(1f);
        printList(list3);

        // Работаем с классом у которого работает только с Т
        // На этапе создания объекта, подсказываем Jave, с каким типом будем работать
        // Сейчас подставили вместо Т, класс Анимал с другого семинара
        Somethink<Animal> somethink = new Somethink<>();
        System.out.println(somethink.get(new Cat()));
        // The Cat{id=0, name='null', numberOfLimbs=0, registrationDate=null, owner=null, records=null}

        // Сейчас вместо Т, поставили тип Стринг
        Somethink<String> somethink1 = new Somethink<>();
        System.out.println(somethink1.get("SomeClass")); //SomeClass

//        Someth<Number, Float> someth = new Someth<>();
//        System.out.println(someth.get(1f));

    }

    public static void printList(List<? extends Number> list) {
        // То есть мы ждем список, из Number и любых наследников числа
    // public static void printList(List<? super Float> list) {
        // Если  super, то flat либо выше по дереву, соответсвенно Number
        for (Object elem: list) {
            System.out.println(elem + " "); // так без проблем
        }
        System.out.println();
    }


}
    
    

