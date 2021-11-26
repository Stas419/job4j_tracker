package ru.job4j.poly;

import ru.job4j.tracker.Transport;

public class Bus implements Transport, Vehicle {

    public void move() {
        System.out.println("едет по асфальту");
    }

    @Override
    public void drive() {
        System.out.println("Едем");
    }

    @Override
    public void passengers(int pas) {
        if (pas > 1) {
            System.out.println("Двери закрываются");
        } else {
            System.out.println("Ждем пасажиров");
        }

    }

    @Override
    public int fillUp(int fuel) {
        int sum = 3;
        return sum * fuel;
    }
}
