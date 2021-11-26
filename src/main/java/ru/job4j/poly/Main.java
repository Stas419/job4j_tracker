package ru.job4j.poly;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train =  new Train();
        Vehicle plane =  new Plane();
        Vehicle[] mass = new Vehicle[]{bus, train, plane};
        for (int i = 0; i < mass.length; i++) {
            mass[i].move();
        }
    }
}
