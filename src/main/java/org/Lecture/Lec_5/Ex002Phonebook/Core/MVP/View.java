package org.Lecture.Lec_5.Ex002Phonebook.Core.MVP;

// 5. ����� �������������, �������� ��������� � ��������
// �������, �����, ��������
// ����������, �������� ����� ������� � � ������������
public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    //
}
