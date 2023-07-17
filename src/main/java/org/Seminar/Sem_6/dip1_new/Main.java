package org.Seminar.Sem_6.dip1_new;


import org.Seminar.Sem_6.dip1_new.model.Report;
import org.Seminar.Sem_6.dip1_new.model.ReportManager;
import org.Seminar.Sem_6.dip1_new.model.util.ConsolePrinter;
import org.Seminar.Sem_6.dip1_new.model.util.ReportPrinter;
import org.Seminar.Sem_6.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        ReportManager manager = new ReportManager(new ReportPrinter());
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        manager.output(report.getItems());
        ReportManager reportManager = new ReportManager(new ConsolePrinter());
        reportManager.output(report.getItems());

    }
}
