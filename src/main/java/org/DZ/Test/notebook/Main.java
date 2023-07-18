package org.DZ.Test.notebook;

import org.DZ.Test.notebook.controller.UserController;
import org.DZ.Test.notebook.dao.impl.FileOperation;
import org.DZ.Test.notebook.model.User;
import org.DZ.Test.notebook.repository.GBRepository;
import org.DZ.Test.notebook.repository.impl.UserRepository;
import org.DZ.Test.notebook.view.UserView;
import org.Seminar.Sem_5.notebook.util.DBConnector;

import static org.Seminar.Sem_5.notebook.util.DBConnector.DB_PATH;
// �������� ���������� ������ ��� ����������
// ������� � ������ ������ �� �������� ������� ����� ��������� � ��, �.�. ��� ����
// ��� ��������� ��� ��������������� ��� ���
// ����������� ������ ��� ��� �� ��������� � �������� �������
// ��� ������ ����������� � ��������, ��� ����� ���������� ���������� � �����������, �.�. ��� ������������ ����� ������

// ����� ����� � ��������� - ���������� ���, UI ���������������� ���������
public class Main {
    public static void main(String[] args) {
        // �������� ���� ������
        DBConnector.createDB();
        // �������� � ���� ������
        FileOperation fileOperation = new FileOperation(DB_PATH);
        // ������ �����������, �������� �� �������������� � ��
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        // ��������� �������� �� ������, ���������������� ����, ���������, ��������� ����� � �.�
        UserController controller = new UserController(repository);
        // ���
        UserView view = new UserView(controller);
        // ������ ����������
        view.run();
    }
}
