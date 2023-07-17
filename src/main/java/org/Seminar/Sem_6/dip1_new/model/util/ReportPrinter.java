package org.Seminar.Sem_6.dip1_new.model.util;


import org.Seminar.Sem_6.dip1_new.model.ReportItem;
import org.Seminar.Sem_6.dip1_new.model.Reportable;

import java.util.List;

public class ReportPrinter implements Reportable {
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }


}
