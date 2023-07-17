package org.DZ.DZ_5.repository;

import org.DZ.DZ_5.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий, для выполнения CreateReadUpdateDelete (CRUD) операций
 * @param <E> тип модели данных
 * @param <I> тип ID модели данных E
 */
public interface GBRepository<E, I> {
    List<E> findAll();
    E create(E e);
    Optional<E> update(I id, E e);
    boolean delete(List<User> allUser, Long id);
    void saveAll(List<E> data);
}
