package org.Lecture.Lec_5.Ex002Phonebook.Core.MVP;

import org.Lecture.Lec_5.Ex002Phonebook.Core.Models.Contact;

// 6. Презентор, он знает о модели и ВЬЮ
public class Presenter {

    private Model model;
    private View view;

    // Аргументы это ВЬЮ и путь к базе данных, которая будет пробрасываться в модель
    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    // Презентор связывает модель с представлением, логика загрузки данных
    public void LoadFromFile() {
        model.load(); // Загрузить данные

        // Если данные есть, то получить их
        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            // и передать их во ВЬЮ
            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }

    // Метод добавления в презенторе, который работает с методом добавления данных
    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }

    // Метод удаления
    public void remove() {
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }

    // Метод сохранения
    public void saveToFile() {
        model.save();
    }

    // Метод переключения к следующей записи
    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);                
            }
        }
    }

    // Метод переключения к предидущей записи
    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);  
            }
        }
    }
}
