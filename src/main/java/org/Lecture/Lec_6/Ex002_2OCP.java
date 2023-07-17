package org.Lecture.Lec_6;

public class Ex002_2OCP {
    public static void main(String[] args) {

        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverPartner().getDiscount(100));
        System.out.println(new VIPPartner().getDiscount(100));
    }
}

class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}
// Скидка будет в дополнение к базовому
class SilverPartner extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}

// Скидка будет в дополнение к серебренному
class VIPPartner extends SilverPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}