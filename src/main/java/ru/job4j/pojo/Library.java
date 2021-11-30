package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCcode = new Book("Clean code", 250);
        Book literature = new Book("Литература", 230);
        Book geography = new Book("География", 100);
        Book physics = new Book("физика", 150);

        Book[] mas = new Book[4];
        mas[0] = cleanCcode;
        mas[1] = literature;
        mas[2] = geography;
        mas[3] = physics;

        for (int i = 0; i < mas.length; i++) {
            Book bok = mas[i];

            System.out.println(i + "Название: " + bok.getName() + "; " + " Kоличество страниц: "
                    + bok.getNumPages());
        }

            Book replacement =  mas[0];
            mas[0] = mas[3];
            mas[3] = replacement;

            System.out.println();

            for (int j = 0; j < mas.length; j++) {
                Book book = mas[j];
                System.out.println(j + "Название: " + book.getName() + "; "
                        + " Kоличество страниц: "
                        + book.getNumPages());
            }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            Book search = mas[i];
            if ("Clean code".equals(search.getName())) {
                System.out.println("книга найдена: " + search.getName());
                break;
            }

        }
    }
}
