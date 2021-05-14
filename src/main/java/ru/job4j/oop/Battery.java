package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another){
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(10);
        Battery battery2 = new Battery(1);
        battery2.exchange(battery);

        System.out.println(battery.load);
        System.out.println(battery2.load);

    }
}
