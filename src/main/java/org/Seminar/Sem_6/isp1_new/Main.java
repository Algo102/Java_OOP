package org.Seminar.Sem_6.isp1_new;

import org.Seminar.Sem_6.isp1_new.pay.impl.InternetPaymentService;
import org.Seminar.Sem_6.isp1_new.pay.impl.TerminalPaymentService;
// ���� ����� ���� ������� 2 ����������, �.�. � ��������� �����������
// ������ ������ �� ��������
public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payPhoneNumber(10);
        internetService.payCreditCard(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);

    }
}
