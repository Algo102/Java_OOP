package org.Seminar.Sem_5.notebook;

import org.Seminar.Sem_5.notebook.controller.UserController;
import org.Seminar.Sem_5.notebook.dao.impl.FileOperation;
import org.Seminar.Sem_5.notebook.model.User;
import org.Seminar.Sem_5.notebook.repository.GBRepository;
import org.Seminar.Sem_5.notebook.repository.impl.UserRepository;
import org.Seminar.Sem_5.notebook.view.UserView;

import static org.Seminar.Sem_5.notebook.util.DBConnector.DB_PATH;
import static org.Seminar.Sem_5.notebook.util.DBConnector.createDB;
// Основные компоненты Модель ВЬЮ Контроллер
// Принято в Модель класть ту сущность которая будет храниться в БД, т.е. тут Юзер
// Все остальное это вспомогательные для них
// Репозиторий Маппер Дао они не участвуют в основном паторне
// Вся логика реализуется в сервисах, где после вычислений передаются в контроллеры, т.е. это состовляющие общей модели

// Точка входа в программу - клиентский код, UI пользовательский интерфейс
public class Main {
    public static void main(String[] args) {
        // Создание базы данных
        createDB();
        // Привязка к базе данных
        FileOperation fileOperation = new FileOperation(DB_PATH);
        // Патерн репозиторий, отвечает за взаимодействие с БД
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        // Контролер отвечает за логику, пользовательский ввод, сохранить, прочитать юзера и т.д
        UserController controller = new UserController(repository);
        // ВЬЮ
        UserView view = new UserView(controller);
        // Запуск приложения
        view.run();
    }
}
