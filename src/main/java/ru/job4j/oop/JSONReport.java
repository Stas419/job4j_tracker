package ru.job4j.oop;

public class JSONReport extends HtmlReport {

    @Override
    public String generate(String name, String body) {
        return name + ": name," +  System.lineSeparator() + body + " : body";
    }
}
