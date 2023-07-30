package org.Seminar.Except_sem3;

import java.io.IOException;

// Создайте метод doSomething(), который может быть источником
// одного из типов checked exceptions (тело метода прописывать
// не обязательно). Вызовите метод из  main и обработайте в
// нем исключение.
public class Zad2_checked {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    static void doSomething() throws IOException{

    }
}

