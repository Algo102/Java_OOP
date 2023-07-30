package org.Lecture.Except_l3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Копирование одного файла в другой
public class Task2_withR {
    public static void main(String[] args) {
// Если хотим с двумя экземплярами, которые тоже нужно будет закрывать
// Некоторые экземпляры можно использовать без исключений, поэтому блок
// try будет работать только на автоматическое закрытие
        //Закрываются через try те экземпляры, которые принадлежат интерфейсу AutoCloseable
        try(FileReader reader = new FileReader("untitled/test.txt");
            FileWriter writer = new FileWriter("untitled/test2.txt")) {
            // до тех пор пака есть что считывать в reader
            while (reader.ready()){
                writer.write(reader.read()); // Записываем прочитаное
            }
            reader.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch Exception" + e.getClass().getSimpleName());
        }

        System.out.println("Copy successfully");
    }
}
