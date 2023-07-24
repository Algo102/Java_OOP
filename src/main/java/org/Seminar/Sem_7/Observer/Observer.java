package org.Seminar.Sem_7.Observer;

// Наблюдатель, он будет получать уведомления
// В данном случае это человек, ищущий работу, получает уведомления от рекрутингового агенства
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
