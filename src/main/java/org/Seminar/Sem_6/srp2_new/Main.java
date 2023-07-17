package org.Seminar.Sem_6.srp2_new;


import org.Seminar.Sem_6.srp2_new.model.Order;

public class Main {
    public static void main(String[] args) {
        ConsoleViewer consoleViewer = new ConsoleViewer();
        Order order = consoleViewer.inputFromConsole();
        Saver jsonSaver = new JsonSaver(order);
        jsonSaver.save();
        Saver txtSaver = new TxtSaver();
        txtSaver.save();
    }
}
