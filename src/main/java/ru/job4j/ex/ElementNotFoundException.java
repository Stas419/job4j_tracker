package ru.job4j.ex;

public class ElementNotFoundException extends java.lang.Exception {
    public ElementNotFoundException(String name) {
        super(name);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = 0;
                break;
            }
        }
        if (rsl == -1) {
            new ElementNotFoundException("Url could not be null");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] mas = new String[]{"окно", "молоко", "трамвай"};
        try {
            indexOf(mas, "окно");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
