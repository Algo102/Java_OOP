package org.Lecture.Lec_1.T1_Point;
/**
 * Это класс для рассчета расстояния между двумя точками
 */
public class Point2D  {
    private int x, y; // Если ничего не писать то public

    // Создали конструктор с двумя переменными
    /** Вызывается слэш и две *
     *  Это конструктор для точки
     * @param valueX это кордината х
     * @param valueY это кордината у
     */
    public Point2D(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }

    // Создали другой конструктор с одной переменной
    public Point2D(int value) {
        // // x = value;
        // // y = value;
        // this.x = value; // this - обращается к полям текущего класса
        // this.y = value;
        this(value, value); // Написав так, вызываем конструктор выше
    }

    // Создали другой конструктор без аргументов
    public Point2D() {
        // x = 0;
        // y = 0;
        this(0); // Написав так вызываем конструктор выше, который вызовет конструктор, который еще выше
    }

    


    
    /**
     * 
     * @return возвращаем х
     */
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    private String getInfo(){ // Создали метод для вывода свой
        return String.format("x: %d; y: %d", x, y);
    }
    
    @Override // Переопределили поведение
    public String toString() { // Переделали родной метод вывода
        return getInfo();
        // return String.format("x: %d; y: %d", x, y);
    }


    /**
     * Метод длч расчета расстояния между а и б
     * @param a точка a(x, y)
     * @param b точка b(x, y)
     * @return длина
     */
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    
}
