package org.Seminar.Sem_6.isp1_new.pay.impl;


import org.Seminar.Sem_6.isp1_new.pay.payCreditCard;
import org.Seminar.Sem_6.isp1_new.pay.payWebMoney;


public class TerminalPaymentService implements payWebMoney, payCreditCard {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }
}
