package org.Seminar.Sem_5.notebook.mapper;

/**
 * ��������� ������� �� ������ ���� � ������.
 * @param <E> ���, �������� � ��
 * @param <T> ���, ���������� ��� ����������� E
 * � �������, ������ ��������� � ������
 */
public interface Mapper<E, T> {
    T toInput(E e);
    E toOutput(T t);
}
