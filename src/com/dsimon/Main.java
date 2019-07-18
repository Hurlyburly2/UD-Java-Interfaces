package com.dsimon;

public class Main {

    public static void main(String[] args) {
        ITelephone dougsPhone;
        dougsPhone = new DeskPhone(1234567);

        dougsPhone.powerOn();
        dougsPhone.callPhone(1234567);
        dougsPhone.answer();

        dougsPhone = new MobilePhone(5478359);

        dougsPhone.callPhone(5478359);
        dougsPhone.answer();
        dougsPhone.powerOn();
        dougsPhone.callPhone(5478359);
    }
}
