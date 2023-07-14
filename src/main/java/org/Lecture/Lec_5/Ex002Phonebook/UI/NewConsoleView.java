package org.Lecture.Lec_5.Ex002Phonebook.UI;
// 8. ≈сли нужно добавить новый функционал врем€ спуст€,
// то создаем новую консоль с новым методом и наследуемс€ от старой консоли
public class NewConsoleView extends ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
