package ru.job4j.oop;

public class Builder extends Engineer {
    private int tunnelLength;

    public Builder(String name, String surname, String education, int birthday, int numDrawing, int tunnelLength) {
        super(name, surname, education, birthday, numDrawing);
        this.tunnelLength = tunnelLength;
    }

    public int getTunnelLength() {
        return tunnelLength;
    }

}
