package com.dsimon;

public class Main {

    public static void main(String[] args) {
        ITelephone dougsPhone;
        dougsPhone = new DeskPhone(1234567);

        dougsPhone.powerOn();
        dougsPhone.callPhone(123131);
        dougsPhone.answer();
    }
}
