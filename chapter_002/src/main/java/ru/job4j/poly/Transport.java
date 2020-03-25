package ru.job4j.poly;

public interface Transport {
    void drive();
    void pax(int count);
    int costTankUp(int fuel);
}
