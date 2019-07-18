package com.dsimon;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, this phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        } else {
            System.out.println("No call to answer.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return true;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
