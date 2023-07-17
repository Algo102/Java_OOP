package org.DZ.DZ_5.repository.impl;

import org.DZ.DZ_5.mapper.impl.UserMapper;
import org.DZ.DZ_5.model.User;
import org.DZ.DZ_5.repository.GBRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
// ����������� �������� �� �������������� ���������� � ��
// ��� �������� � �� ���� � ����� �����������, ������ ���������� � �.�
public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;


    private final String fileName;

    public UserRepository(String fileName) {
        this.fileName = fileName;
        this.mapper = new UserMapper();
        try (FileWriter writer = new FileWriter(fileName, true)){
            writer.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> findAll() {
        List<String> lines = readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    private List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //������� ������ FileReader ��� ������� File
            FileReader fr = new FileReader(file);
            //������� BufferedReader � ������������� FileReader ��� ����������� ����������
            BufferedReader reader = new BufferedReader(fr);
            // ������� ������� ������ ������
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // ��������� ��������� ������ � �����
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
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
        List<User> lines = new ArrayList<>(users);
        saveAll(lines);
        return user;
    }

    @Override
    public Optional<User> update(Long id, User user) {
        List<User> users = findAll();
        // ��������� � ��������� ������ ������� ���������, � �������� ����� ������,
        // ������� ��������� �� id, ���� id � ������ ��������� � id ������� ������,
        // ���� ������ ���������, ���� ����, �� ������, ���� ���, �� ������� ���
        // ��� ����������� � ��������� ������ ������, �� ���� ����������, ������� ����������� ������
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
        // ������� ����� ������
        List<User> lines = new ArrayList<>();
        saveAll(lines);
    }

    @Override
    public boolean delete(List<User> allUser, Long id) {
        List<User> users = findAll();
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id)).
                findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        users.remove(editUser);
        write(users);
        return true;
    }

    @Override
    public void saveAll(List<User> data) {
        try (FileWriter writer = new FileWriter(fileName, false)){
            for (User line : data){
                writer.write(line.toString());
                writer.append('\n');
            }
            writer.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
