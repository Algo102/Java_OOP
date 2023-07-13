package org.Seminar.Sem_4.MyList;
// ������� ���������, �.�. ��������� � ���������� ������� ������ ������ ����������
public interface GBList<T> extends Iterable<T> {

    boolean add(T t);

    // ������ ������ add, �� ��� boolean
    GBList<T> join(T t);

    void  remove(int index);

    T get(int index);

    int size();

    void update(int index, T t);
}
