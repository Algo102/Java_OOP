package org.Lecture.Lec_5.Ex002Phonebook.UI;
// 8. ���� ����� �������� ����� ���������� ����� ������,
// �� ������� ����� ������� � ����� ������� � ����������� �� ������ �������
public class NewConsoleView extends ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
