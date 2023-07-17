package org.Lecture.Lec_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// ������� ����������� ������
// ��������� �� ������ "������" ���������
// ��������� �� ������ ������ ������ ��� ��������

public class Ex003_2LSP {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }

        // �.�. ����� ��� ���������, �� �� ���� �� ������ �������� ������
        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog()/* , new Python() */));
        for (var animal : list2) {
            System.out.println(animal.getLegsCount());
        }
    }
}

abstract class AbstractAnimal {
    public String getType() {
        return "��������";
    }
}

interface Legs {
    int getLegsCount();
}

class Dog extends AbstractAnimal implements Legs {

    @Override
    public String getType() {
        return "�������";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Python extends AbstractAnimal {
    @Override
    public String getType() {
        return "��������";
    }
}