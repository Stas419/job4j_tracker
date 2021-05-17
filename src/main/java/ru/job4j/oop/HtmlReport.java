package ru.job4j.oop;

public class HtmlReport {
    public String generate(String name, String body) {

        return name + System.lineSeparator() + body;
    }
}
