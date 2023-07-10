package org.DZ.DZ_3.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Создали класс для лучшего понимания Итератора
public class ComponentIterator implements Iterator<Component> {

    List<Component> components = new ArrayList<>();
    int componentsCount = 0;

    public boolean hasNext() {
        return componentsCount < components.size();
    }

    public Component next() {
        return components.get(componentsCount++);
    }

}

