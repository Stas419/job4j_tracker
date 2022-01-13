package ru.job4j.search;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person copy: person) {
            if (copy.toString().contains(key)) {
                result.add(copy);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Person person = new Person("вася", "труханов", "34-15-22", "сосновая 3");
        Person person2 = new Person("степа", "михалков", "12-22-18", "сибирская  15");
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.person.add(person);
        phoneDictionary.person.add(person2);
        ArrayList<Person> num = phoneDictionary.find("нов");
        for (Person passing : num) {
            System.out.println(passing.toString());
        }
    }
}
