package org.DZ.Test.notebook.controller;

import org.DZ.Test.notebook.model.User;
import org.DZ.Test.notebook.repository.GBRepository;

import java.util.List;
import java.util.Objects;
// Контроллер - пользовательский ввод, сохранить, прочитать юзера
// С него вызываем логику, которая реализована в репозитории
public class UserController {
    private final GBRepository<User, Long> repository;

    public UserController(GBRepository<User, Long> repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public List<User> readAllUsers() {
        return repository.findAll();
    }

    public void updateUser(Long userid, User user) {
        user.setId(userid);
        repository.update(userid, user);
    }
}
