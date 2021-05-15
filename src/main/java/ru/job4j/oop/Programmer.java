package ru.job4j.oop;

public class Programmer extends Engineer{
    private String technologies;

    public Programmer(String name,String surname, String education, String birthday, int numDrawing, String technologies){
        super(name, surname, education, birthday, numDrawing);
        this.technologies = technologies;
    }

    public String getTechnologies(){
        return technologies;
    }
}
