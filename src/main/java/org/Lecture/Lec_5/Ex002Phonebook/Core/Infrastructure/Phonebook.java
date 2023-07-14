package org.Lecture.Lec_5.Ex002Phonebook.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;
// 2. Ядро приложения в котором инфроструктурный модуль

import org.Lecture.Lec_5.Ex002Phonebook.Core.Models.Contact;
// Записная книжка и ее механика
public class Phonebook {

    private List<Contact> contacts;

    // Инициализация - создание записной книги
    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create - создание записи
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read - получение записи
    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update - обновление
    // ???...

    // delete - удаление записи
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        // if ???...
        return contacts;
    }


    public int count() {
        return contacts.size();
    }

}
