package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
        System.out.println("Петю три раза сыграть на баяне и три раза спеть.");

    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();

    }
}
