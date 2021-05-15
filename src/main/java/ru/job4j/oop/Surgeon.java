package ru.job4j.oop;

public class Surgeon extends Doctor{
    private int kolOperations;

    public Surgeon(String name,String surname, String education, String birthday, String direction, int kolOperations){
        super( name, surname, education, birthday, direction);
        this.kolOperations = kolOperations;
    }

    public int getKolOperations(){
        return kolOperations;
    }

}
