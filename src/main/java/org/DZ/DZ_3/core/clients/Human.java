package org.DZ.DZ_3.core.clients;

/**
 Абстракция человека
 */
public class Human extends Animal { // todo на семинаре, в учебных целях, сделать extends Animal, для чего то нам нужно было считать, что человек это тоже животное и Хьюман унаследовали от Анимал, но таким образом при создании объекта человек его стало можно лечить на ровне с животными, и чтоб исключить человека, создали интерфейс с лечением Анималс и имплементировали его в диких животных и Pet

    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
