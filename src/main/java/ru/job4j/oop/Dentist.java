package ru.job4j.oop;

public class Dentist extends Doctor {
    private int numberOfFillings;

    public Dentist(String name, String surname, String education, int birthday, String direction) {
        super(name, surname, education, birthday, direction);
        this.numberOfFillings = numberOfFillings;

    }

    public int getNumberOfFillings() {
        return numberOfFillings;
    }

    public void pacient(int numberOfFillings) {
        System.out.println(numberOfFillings);
    }

}
