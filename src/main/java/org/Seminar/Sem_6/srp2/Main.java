package org.Seminar.Sem_6.srp2;

import org.Seminar.Sem_6.srp2.model.Order;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}
