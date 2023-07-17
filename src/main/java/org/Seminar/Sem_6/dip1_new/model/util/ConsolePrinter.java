package org.Seminar.Sem_6.dip1_new.model.util;

import org.Seminar.Sem_6.dip1_new.model.ReportItem;
import org.Seminar.Sem_6.dip1_new.model.Reportable;

import java.util.List;

public class ConsolePrinter implements Reportable {
    public void output(List<ReportItem> items) {
        System.out.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("Console print %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
