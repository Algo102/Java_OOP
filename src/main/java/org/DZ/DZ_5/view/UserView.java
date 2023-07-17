package org.DZ.DZ_5.view;


import org.DZ.DZ_5.controller.UserController;
import org.DZ.DZ_5.model.User;
import org.DZ.DZ_5.util.Commands;


import java.util.List;
import java.util.Scanner;
// ������� �� ������ ��������� ����������������� �����
public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("������� �������: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("���: ");
                    String lastName = prompt("�������: ");
                    String phone = prompt("����� ��������: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("������������� ������������: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readAllUsers();
                        System.out.println(users);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try {
                        String name = prompt("���: ");
                        String secondName = prompt("�������: ");
                        String number = prompt("����� ��������: ");
                        Long userid = Long.parseLong(prompt("������� ������������� ������������"));
                        User updated = new User(name, secondName, number);
                        userController.updateUser(userid, updated);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case DELETE:
                    try {
                        Long userid = Long.parseLong(prompt("������� ������������� ������������"));
                        List<User> users = userController.readAllUsers();
                        userController.delete(users, userid);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
