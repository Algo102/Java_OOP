package org.Lecture.Except_L2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4_finally {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch Exception" + e.getClass().getSimpleName());
        } finally { // Блок в котором гарантировано выполнятся все операции
            System.out.println("finally start");
            if(test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}
