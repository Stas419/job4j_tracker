package ru.job4j.oop;

public class Programmer extends Engineer {
    private String project;

    public Programmer(String name, String surname, String education, int birthday, int numDrawing, String technologies) {
        super(name, surname, education, birthday, numDrawing);
        this.project = technologies;
    }

    public String getProject() {
        return project;
    }
}
