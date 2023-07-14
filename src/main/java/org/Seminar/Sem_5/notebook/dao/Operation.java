package org.Seminar.Sem_5.notebook.dao;

import java.util.List;
// Старый паттерн, у которого задача прописать методы для взаимодействия с БД
// Устарел и дублирует Репозиторий, у репозитория взаимодействие идет уже по веткам
/**
 * Data Access Object (DAO) слой, с методами для работы с БД
 * @param <T> тип объекта для чтения/записи.
 */
public interface Operation<T> {
    List<T> readAll();
    void saveAll(List<T> data);
}
