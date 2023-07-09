package org.Seminar.Sem_3.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Класс лекарство
public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private List<Component> components;
    private int componentsCount; // количество компонентов

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }

    public Pharmacy addComponet(Component component){
        this.components.add(component);
        this.componentsCount++;
        return this; // Верни мне этот же компонент, но уже обновленный, условно ссылка на экземпляр объекта с которым
        // работаем и который просим вернуть
    }

    // переопределяем метод явы по умолчанию, который есть у объекта, даже если у класса нет методов
    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + componentsCount +
                '}' +  " Total power = "+ getPower(this) + "\n";
    }

    // Имплиментировали Iterable и эти два метода перенесли вниз
//    // определяем существует ли следующий компонент
//    @Override
//    public boolean hasNext() {
//        return componentsCount < components.size();
//    }
//
//    // возвращает ссылку на следующий элемент
//    @Override
//    public Component next() {
//        return components.get(componentsCount++);
//    }

    @Override
    public Iterator<Component> iterator() {
//        // Анонимный класс, так как у интерфейсов нужно обязательно реализовывать методы, то если он нигде больше не
//        // нужен и реализовывать мы его больше ни где не хотим, то можно реализовать таким образом (область видимости
//        // будет только внутри фигурных скобок). New отвечает за вызов конструктора, но у интерфейсов нет
//        // конструктора, и ява говорит, что я не знаю ни каких конструкторов, но есть два метода, открывает фигурные
//        // скобки и предлагает реализовать все имеющие методы интерфейса, благо у итератора их два. И не нужно писать
//        // для него отдельную реализацию  в отдельном файле, отдельный класс.
//        return new Iterator<Component>() {
//            @Override
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//
//            @Override
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//        };
        // Для примера создали класс. Это одно и то же.
        return new ComponentIterator();
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
//        if(pow1 > pow2)
//            return 1;
//        else if (pow1 < pow2)
//            return -1;
//        else
//            return 0;
        // Это тоже самое, ява свернула, т.к. написали ее же код, стандартный метод compare,
        // который сравнивает два числа (пр.кн.мыши и show context action)
        return Integer.compare(pow1, pow2);
    }

    // создали метод который будет бежать по компонентам и складывать
    // power, а выше этот метод применяем
    private int getPower(Pharmacy pharm){
        int result = 0;
        for(Component elem: pharm.getComponents()){
            result += elem.getPower();
        }
        return result;
    }
}
