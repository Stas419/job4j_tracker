package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCcode = new Book("Чистый код", 250);
        Book literature = new Book("Литература", 230);
        Book geography = new Book("География", 100);
        Book physics = new Book("физика", 150);

        Book[] book = new Book[4];
        book[0] = cleanCcode;
        book[1] = literature;
        book[2] = geography;
        book[3] = physics;

        for(Book bok: book){
            System.out.println(bok.getName() + " - " + bok.getNumPages());
        }

        Book bok = book[0];
        book[0] = book[3];
        book[3] = bok;
        System.out.println( "ячейка с индексом 0 - "+ book[0].getName() + " - " +  book[0].getNumPages());
        System.out.println( "ячейка с индексом 3 - "+ book[3].getName() + " - " +  book[3].getNumPages());

        for(Book bok1: book) {
            if ("Чистый код".equals(bok1.getName())) {
                System.out.println("В списке есть такая книга");
                System.out.println(bok.getName() + " - " + bok.getNumPages());
            }
        }
    }
}
