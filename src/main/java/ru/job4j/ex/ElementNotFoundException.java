package ru.job4j.ex;
public class ElementNotFoundException extends java.lang.Exception {
    public ElementNotFoundException(String name) {
        super(name);
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] mas = new String[]{"окно", "молоко", "трамвай"};
        try {
            FindEl.indexOf(mas, "окно");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
