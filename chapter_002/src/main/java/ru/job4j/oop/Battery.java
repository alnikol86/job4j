package ru.job4j.oop;

public class Battery {
    private int load;

    public void battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
