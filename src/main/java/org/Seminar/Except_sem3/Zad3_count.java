package org.Seminar.Except_sem3;

import java.io.IOException;

// Создайте //класс Счетчик, у которого есть метод add(), увеличивающий значение
// внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
// можно было работать в блоке try with resources. Нужно бросить исключение, если
// работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался
// открыт. Подумайте какой тип исключения подойдет //лучше всего.
public class Zad3_count {
    public static void main(String[] args) {
//        try (Counter counter = new Counter()){
//            counter.add();
//            //counter.close();
//            counter.add();
//            System.out.println(counter.getCount());
//            // метод close не вызывали, но в консоли видно, что он отработал
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // или так, то же самое
        int res = extracted();
        System.out.println(res);
    }

    private static int extracted(){
        try (Counter counter = new Counter()){
            counter.add();
            counter.add();
            return counter.getCount();
        }catch (IOException e){
            e.printStackTrace();
        }
        return 0;
    }
}

