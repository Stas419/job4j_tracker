package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int kolOperations;

    @SuppressWarnings("ConstantConditions")
    public Surgeon(String name, String surname, String education, int birthday, String direction) {
        super(name, surname, education, birthday, direction);
        this.kolOperations = kolOperations;
    }

    public int getKolOperations() {
        return kolOperations;
    }

}
