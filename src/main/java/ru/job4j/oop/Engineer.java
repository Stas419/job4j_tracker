package ru.job4j.oop;

public class Engineer extends Profession {
    private int numDrawing;

    public Engineer(String name, String surname, String education, int birthday, int numDrawing) {
        super(name, surname, education, birthday);
        this.numDrawing = numDrawing;
    }

    public int getBirthday() {
        return numDrawing;
    }

    public void workingInformation(Programmer kolProject, Builder kolLength) {
        System.out.println(kolProject.getProject());
        System.out.println(kolLength.getTunnelLength());
    }

}
