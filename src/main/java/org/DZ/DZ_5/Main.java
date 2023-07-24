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
// �������� ���������� ������ ��� ����������
// ������� � ������ ������ �� �������� ������� ����� ��������� � ��, �.�. ��� ����
// ��� ��������� ��� ��������������� ��� ���
// ����������� ������ ��� ��� �� ��������� � �������� ��������
// ��� ������ ����������� � ��������, ��� ����� ���������� ���������� � �����������, �.�. ��� ������������ ����� ������

// ����� ����� � ��������� - ���������� ���, UI ���������������� ���������
public class Main {
    public static void main(String[] args) {
        //createDB();
        DBConnector.createDB();
        // ������� �����������, �������� �� �������������� � ��
        GBRepository<User, Long> repository = new UserRepository(DB_PATH);
        // ��������� �������� �� ������, ���������������� ����, ���������, ��������� ����� � �.�
        UserController controller = new UserController(repository);
        // ���
        UserView view = new UserView(controller);
        // ������ ����������
        view.run();


    }
}
