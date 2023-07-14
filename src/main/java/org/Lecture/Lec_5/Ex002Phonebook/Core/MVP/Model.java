package org.Lecture.Lec_5.Ex002Phonebook.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.Lecture.Lec_5.Ex002Phonebook.Core.Infrastructure.Phonebook;
import org.Lecture.Lec_5.Ex002Phonebook.Core.Models.Contact;
// 4. Модель работает с записной книжкой
public class Model {

    Phonebook currentBook;
    private int currentIndex;
    private String path;

    // Нужно работать с данными поэтому в качестве аргумента, путь к базе данных
    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    // Получение текущего контакта, на который смотрит индекс
    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact(currentIndex);
        } else {
            // ???...
            return null;
        }
    }

    // Логика загрузки данных
    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Логика сохранения данных
    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Логика получения всей записной книжки
    public Phonebook currentBook() {
        return this.currentBook;
    }

    // Логика получения текущего индекса
    public int getCurrentIndex() {
        return this.currentIndex;
    }

    // Возможность поменять текущий индекс
    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}