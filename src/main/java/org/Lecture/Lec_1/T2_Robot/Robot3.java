package org.Lecture.Lec_1.T2_Robot;

import java.util.ArrayList;

public class Robot3 {

    enum State { // Два возможных состояния
        On, Off
    }

    // Заводим поля, для того чтоб нельзя было создать 2 робота с одинаковым именем
    private static int defaultIndex; // Индекс для нумерации
    private static ArrayList<String> names; // Коллекция имен


    static {
        defaultIndex = 1; // Начальный индекс 1
        names = new ArrayList<String>(); // Инициализируем пустую коллекцию
    }

    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    private State state; // состояние робота. Либо вкл/выкл

    /**
     * Создание робота
     * 
     * @param name  Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot3(String name, int level) {
        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty() // Если имя которое задает пользователь будет пустым
                || Character.isDigit(name.charAt(0))) // Или начинается с цифры
                || Robot3.names.indexOf(name) != -1) // Или имя уже задано

        {
            this.name =
             String.format("DefaultName_%d", defaultIndex++); // То имя задастся дефолтом
        } else {
            this.name = name; // Или примет от пользователя
        }

        Robot3.names.add(this.name); // Добавляем в коллекцию
        this.level = level; // Инициализация уровня
        this.state = State.Off; // Инициализация состояния

    }

    // #region другие конструкторы
    // Можно сделать конструктор с одним аргументом, у которого уровень будет 1
    // public Robot3(String name)
    // {
    // if ((name.isEmpty()
    // || Character.isDigit(name.charAt(0)))
    // || Robot3.names.indexOf(name) == -1)

    // { this.name = String.format("DefaultName_%d", defaultIndex++); }
    // else { this.name = name; }

    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }

    // Другой конструктор, без аргументов, где по умолчанию присваивается дефолтное имя
    // public Robot3()
    // {
    // this.name = String.format("DefaultName_%d", defaultIndex++);
    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }

    // #endregion

    // #region правильные конструкторы

    public Robot3(String name) {
        this(name, 1);
    }

    public Robot3() {
        this("");
    }

    // #endregion

    // Методы вкл\выкл подсистем

    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
