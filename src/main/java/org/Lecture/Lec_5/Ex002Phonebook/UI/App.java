package org.Lecture.Lec_5.Ex002Phonebook.UI;

import java.util.Scanner;

import org.Lecture.Lec_5.Ex002Phonebook.Config;
import org.Lecture.Lec_5.Ex002Phonebook.Core.MVP.Presenter;
import org.Lecture.Lec_5.Ex002Phonebook.Core.MVP.View;

// 9. Создаем кнопку для запуска приложения
public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы

        // Создание консоли, если старая консоль то ConsoleView();
        View view = new NewConsoleView();

        // Презентор принимает ВЬЮ и путь к файлу
        Presenter presenter = new Presenter(view, Config.pathDb);

        // Презентор отвечает за загрузку данных
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
