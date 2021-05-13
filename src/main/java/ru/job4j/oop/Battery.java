package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another){
        this.load = this.load - another.load;
        another.load += another.load;

    }

    public static void main(String[] args) {
        Battery battery = new Battery(5);
        Battery battery2 = new Battery(5);
        battery.exchange(battery2);

        System.out.println(battery.load);
        System.out.println(battery2.load);

    }
}
