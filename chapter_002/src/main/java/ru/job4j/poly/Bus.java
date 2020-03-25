package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        boolean canDrive = true;
    }

    @Override
    public void pax(int count) {
        int boarding = count;
    }

    @Override
    public int costTankUp(int fuel) {
        int costOneGallon = 1;
        int receipt = fuel * costOneGallon;
        return receipt;
    }
}
