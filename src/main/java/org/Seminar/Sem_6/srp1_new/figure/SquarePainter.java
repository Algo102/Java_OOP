package org.Seminar.Sem_6.srp1_new.figure;

public class SquarePainter {
    // тут связываем классы через аргументы метода, а в srp2 через конструктор
    public void draw(Square square) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < square.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < square.getSide(); i++) {
            if (i < square.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < square.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
