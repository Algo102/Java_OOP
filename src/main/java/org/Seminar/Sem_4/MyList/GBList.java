package org.Seminar.Sem_4.MyList;
// создали интерфейс, т.к. планируем к јррайЋисту сделать больше одного наследника
public interface GBList<T> extends Iterable<T> {

    boolean add(T t);

    // јнолог метода add, но без boolean
    GBList<T> join(T t);

    void  remove(int index);

    T get(int index);

    int size();

    void update(int index, T t);
}
