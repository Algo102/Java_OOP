package org.DZ.DZ_5.mapper;

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
