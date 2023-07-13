package org.Seminar.Sem_4.MyList;

import java.util.Iterator;
// —оздаем свой аррайЋист (динамический массив)
public class ArrayIterator<T> implements Iterator<T> {
    int index;
    T[] values;

    public ArrayIterator(T[] values) {
        this.values = values;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
