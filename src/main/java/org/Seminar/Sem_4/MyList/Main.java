package org.Seminar.Sem_4.MyList;

public class Main {
    public static void main(String[] args) {
        GBList<Number> gbList = new GBArrayList<>();
        gbList.add(1);
        gbList.add(2);
        gbList.add(3.14);
        gbList.join(4).join(5).join(6);

        System.out.println(gbList);
        gbList.remove(2);
        System.out.println(gbList);
        System.out.println(gbList.size());
        System.out.println(gbList.get(2));
        gbList.update(0, 3.15f);
        System.out.println(gbList);
        System.out.println(gbList.get(12));

    }
}
