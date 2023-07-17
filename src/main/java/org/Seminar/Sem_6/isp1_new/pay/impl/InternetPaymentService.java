package org.Seminar.Sem_6.isp1_new.pay.impl;

import org.Seminar.Sem_6.isp1_new.pay.payCreditCard;
import org.Seminar.Sem_6.isp1_new.pay.payPhoneNumber;
import org.Seminar.Sem_6.isp1_new.pay.payWebMoney;

public class InternetPaymentService implements payCreditCard, payPhoneNumber, payWebMoney {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
