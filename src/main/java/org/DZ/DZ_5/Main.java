package org.DZ.DZ_5;

import org.DZ.DZ_5.controller.UserController;
import org.DZ.DZ_5.model.User;
import org.DZ.DZ_5.repository.GBRepository;
import org.DZ.DZ_5.repository.impl.UserRepository;
import org.DZ.DZ_5.util.DBConnector;
import org.DZ.DZ_5.view.UserView;


import java.util.ArrayList;
import java.util.List;

import static org.DZ.DZ_5.util.DBConnector.*;
// Основные компоненты Модель ВЬЮ Контроллер
// Принято в Модель класть ту сущность которая будет храниться в БД, т.е. тут Юзер
// Все остальное это вспомогательные для них
// Репозиторий Маппер Дао они не участвуют в основном паттерне
// Вся логика реализуется в сервисах, где после вычислений передаются в контроллеры, т.е. это состовляющие общей модели

// Точка входа в программу - клиентский код, UI пользовательский интерфейс
public class Main {
    public static void main(String[] args) {
        //createDB();
        DBConnector.createDB();
        // Паттерн репозиторий, отвечает за взаимодействие с БД
        GBRepository<User, Long> repository = new UserRepository(DB_PATH);
        // Контролер отвечает за логику, пользовательский ввод, сохранить, прочитать юзера и т.д
        UserController controller = new UserController(repository);
        // ВЬЮ
        UserView view = new UserView(controller);
        // Запуск приложения
        view.run();


    }
}
