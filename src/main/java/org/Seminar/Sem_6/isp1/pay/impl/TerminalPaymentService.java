package org.Seminar.Sem_6.isp1.pay.impl;


import org.Seminar.Sem_6.isp1.pay.Payable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements Payable {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        throw new NotImplementedException();
    }
}
