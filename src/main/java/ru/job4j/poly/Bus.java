package ru.job4j.poly;

import ru.job4j.tracker.Transport;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int pas) {

    }

    @Override
    public int fillUp(int fuel) {
        int sum = 3;
        return sum * fuel;
    }
}
