package com.dsimon;

public class Main {

    public static void main(String[] args) {
        // INHERITANCE:
            // Limited because you can only inherit from one thing

        // INTERFACES:
            // Class can use several interfaces
            // For example, a mobile phone is like a computer, but still could use a phone interface
            // But also can use a web browser or computer interface

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
