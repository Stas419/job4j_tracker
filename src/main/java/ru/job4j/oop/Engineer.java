package ru.job4j.oop;

public class Engineer extends Profession {
    private int numDrawing;

    public Engineer(String name, String surname, String education, String birthday, int numDrawing) {
        super(name, surname, education, birthday);
        this.numDrawing = numDrawing;
    }

    public int getNumDrawing() {

        return numDrawing;
    }




}
