package ru.job4j.oop;

public class Doctor extends Profession {
    private String direction;

    public Doctor(String name, String surname, String education, int birthday, String direction) {
        super(name, surname, education, birthday);
        this.direction = direction;
    }

    public void heal(Surgeon operations, Dentist  fillings) {
        System.out.println(operations.getKolOperations());
        System.out.println(fillings.getNumberOfFillings());
    }
}
