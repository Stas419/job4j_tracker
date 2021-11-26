package ru.job4j.oop;

public class Dentist extends Doctor {
    private int numberOfFillings;

    public Dentist(String name, String surname, String education, String birthday, String direction, int numberOfFillings) {
        super(name, surname, education, birthday, direction);
        this.numberOfFillings = numberOfFillings;
    }

    public int getNumberOfFillings() {
        return numberOfFillings;
    }

}
