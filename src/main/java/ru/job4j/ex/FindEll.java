package ru.job4j.ex;

public class FindEll {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw  new ElementNotFoundException("Url could not be null");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] values = new String[]{"Петр", "Семен"};
        String key = "Петр";
        indexOf(values, key);
    }
}
