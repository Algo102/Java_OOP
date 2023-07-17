package org.Seminar.Sem_5.notebook.repository.impl;


import org.Seminar.Sem_5.notebook.mapper.impl.UserMapper;
import org.Seminar.Sem_5.notebook.model.User;
import org.Seminar.Sem_5.notebook.repository.GBRepository;
import org.Seminar.Sem_5.notebook.dao.impl.FileOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
// Репозиторий отвечает за взаимодействие приложения и БД
// Все операции с БД суют в класс репозиторий, логика сохранения и т.д
public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    @Override
    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User u: users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long id, User user) {
        List<User> users = findAll();
        // Запускаем в отдельном потоке перебор коллекции, и вызываем метод фильтр,
        // который фильтрует по id, если id в списке совпадает с id который пришел,
        // ищет первое вхождение, если есть, то вернет, если нет, то сообщит НЕТ
        // Это выполняется в отдельном потоке Демоне, на фоне приложения, поэтому выполняется быстро
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id)).
                findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        editUser.setId(id);
        editUser.setFirstName(user.getFirstName());
        editUser.setPhone(user.getPhone());
        editUser.setLastName(user.getLastName());

        write(users);

        return Optional.empty();
    }

    //
    private void write(List<User> users){
        // Создаем новый список
        List<String> lines = new ArrayList<>();
        // Бежим по юзерам
        for (User u: users) { // Маппим в строчки
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
