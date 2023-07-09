package org.Lecture.Lec_1.T1_Point;
// Считаем расстояние между двумя точками
// Простым способом с помощью метода и с помощью класса

public class Pouint2D_Progr {

    // // Метод для работы по старинке
    // static double distance(int x1, int y1, int x2, int y2) {
    //     return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    // }

    // перегрузка с этим же названиемна другое количество аргументов
    // т.к. перевели в приват этот метод тут не видно
    // static double distance(Point2D a, Point2D b) {
    //     return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    // }

    

    public static void main(String[] args) {
        // С помощью экземпляров
        Point2D a = new Point2D(1,2);
        // a.x = 0; // перестали работать, т.к. сделали private
        // a.y = 2;
        a.setX(0);

        // a = new Point2D(); // Если так оставить, проиницилизируется новая точка, а старые данные затрутся

        System.out.println(a.toString()); // Вызвали метод, который и так по умолчанию
        // System.out.println(a.getInfo()); // Перевели в приват
        System.out.println(a); // Переделали его, чтоб показывал Стринг, а не Хэш

        //Point2D b = new Point2D(0); // Можно и так, потому что есть конструктор на один аргумент, который принимает и х=0 и у=0
        Point2D b = new Point2D(0, 10);
        // b.x = 0;
        // b.y = 10;
        System.out.println(b);

        System.out.println(a.getX()); 
        System.out.println(a.getY());

        //System.out.println(distance(a, b)); // не можем так вызвать, так как перенесли в класс Поинт2Д
        var dis = Point2D.distance(a, b); // Если есть static то обращаться нужно через имя типа Point2D
        System.out.println(dis);
        


        // // Обычным способом
        // int ax = 0;
        // int ay = 2;
        // int bx = 0;
        // int by = 10;
        // System.out.println(distance(ax, ay, bx, by));        
    }
}
