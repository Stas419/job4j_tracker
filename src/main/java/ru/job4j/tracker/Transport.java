package ru.job4j.tracker;

public interface Transport {
    void drive();

    void passengers(int pas);

    int fillUp(int fuel);
}
