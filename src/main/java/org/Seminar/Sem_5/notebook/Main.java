package org.Seminar.Sem_5.notebook;

import org.Seminar.Sem_5.notebook.controller.UserController;
import org.Seminar.Sem_5.notebook.dao.impl.FileOperation;
import org.Seminar.Sem_5.notebook.model.User;
import org.Seminar.Sem_5.notebook.repository.GBRepository;
import org.Seminar.Sem_5.notebook.repository.impl.UserRepository;
import org.Seminar.Sem_5.notebook.view.UserView;

import static org.Seminar.Sem_5.notebook.util.DBConnector.DB_PATH;
import static org.Seminar.Sem_5.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
