package ru.job4j.ex;

public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String name) {
        super(name);
    }
}
