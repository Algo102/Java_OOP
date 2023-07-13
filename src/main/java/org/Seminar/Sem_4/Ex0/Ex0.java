package org.Seminar.Sem_4.Ex0;

import org.Seminar.Sem_3.core.clients.Animal;
import org.Seminar.Sem_3.core.clients.animal.home.impl.Cat;

import java.util.ArrayList;
import java.util.List;

public class Ex0 {
    public static void main(String[] args) {
        // ��� ���������� ���� �� 5 Java, � ���� ����� ���� ������ ��� ��� ������.
        // ���� �� ��������� ���������� � ���������� ����� ����
//        List list = new ArrayList<>();
//        list.add(1);
//        list.add(true);
//        list.add("sddsfbdsfb");
//
//        for (Object o: list) {
//            System.out.println(o);
//        }
            // ���������� ��� ��������,
//        1
//        true
//        sddsfbdsfb
            //System.out.println(((String) o).length()); // ������ �� ������������
            // �� ������ ���� �������� �����, ����� ���������� � ������, ������ ��
            // �����, �.�. ��� ��� Object, � �� ����� ����� true � Integer.
            // ����� ����� toString ��� ��� ������ ������
//            System.out.println((o + "").length());
            // � ��� ��� ��� ��������� � ������ � ��������
//            1
//            4
//            10


        // �� ���� ����������� ��� ��������� � �������� ������ ���� � ������ � �� ������� ������,
        // � ����� ���������� �������, ����� ������� �� ������� ������ ������,
        // ������� ����� ���������.
        // �����. ��� ���� ����� ������ ��� ��� ���� �� ��������� ������ � ������ ��������� ����,
        // �� � ������ ���������� ��� �������� � Object
//        List<String> list1 = new ArrayList<>();
//        // list1.add(1); // ���������� ����� ��� ��� �� ������ � ������������
//        list1.add("1");
//        // list1.add(true);
//        list1.add("true");
//        list1.add("sddsfbdsfb");
//
//        for (Object o: list1) {
//            System.out.println(((String) o).length()); // ��� �������
//        }


        // ����� ����� ����������, ��� ���� �� ������ ������� �������� Object, �.�.
        // ��������� �� ��� �� ����� ����� ���. �.�. ���� ��������� �� �� ����� �����
//        List<?> list2 = new ArrayList<>();
//        for (Object o: list2) {
//            System.out.println(((String) o).length()); // ��� ��� �������
//        }
        
        // � � ������� ������� ����� ��������� ����������� �� �������.
        // � �������, �������� ����� ������� ����� �������� �� ������ �����, 
        // �� ������� ����������� ������
        List<Float> list3 = new ArrayList<>();
        list3.add(1f);
        printList(list3);

        // �������� � ������� � �������� �������� ������ � �
        // �� ����� �������� �������, ������������ Jave, � ����� ����� ����� ��������
        // ������ ���������� ������ �, ����� ������ � ������� ��������
        Somethink<Animal> somethink = new Somethink<>();
        System.out.println(somethink.get(new Cat()));
        // The Cat{id=0, name='null', numberOfLimbs=0, registrationDate=null, owner=null, records=null}

        // ������ ������ �, ��������� ��� ������
        Somethink<String> somethink1 = new Somethink<>();
        System.out.println(somethink1.get("SomeClass")); //SomeClass

//        Someth<Number, Float> someth = new Someth<>();
//        System.out.println(someth.get(1f));

    }

    public static void printList(List<? extends Number> list) {
        // �� ���� �� ���� ������, �� Number � ����� ����������� �����
    // public static void printList(List<? super Float> list) {
        // ����  super, �� flat ���� ���� �� ������, ������������� Number
        for (Object elem: list) {
            System.out.println(elem + " "); // ��� ��� �������
        }
        System.out.println();
    }


}
    
    

