package org.DZ.DZ_2.core.clients.supports;

import java.time.LocalDate;


/**
 * Запись в карточке пациента.
 */
public class Record {
    private String record;
    private LocalDate date;

    public Record(String record, LocalDate date) {
        this.record = record;
        this.date = date;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "record='" + record + '\'' +
                ", date=" + date +
                '}';
    }
}
