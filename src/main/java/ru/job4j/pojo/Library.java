package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCcode = new Book();
        Book literature = new Book();
        Book geography = new Book();
        Book physics = new Book();

        cleanCcode.setName("Чистый код");
        cleanCcode.setNumPages(250);

        literature.setName("Литература");
        literature.setNumPages(230);

        geography.setName("География");
        geography.setNumPages(180);

        physics.setName("физика");
        physics.setNumPages(150);

        Book[] book = new Book[4];
        book[0] = cleanCcode;
        book[1] = literature;
        book[2] = geography;
        book[3] = physics;

        for (int i = 0; i < book.length; i++) {
            Book bok =  book[i];
            System.out.println(bok.getName() + " - " + bok.getNumPages());
        }

        Book bok = book[0];
        book[0] = book[3];
        book[3] = bok;
        System.out.println( "ячейка с индексом 0 - "+ book[0].getName() + " - " +  book[0].getNumPages());
        System.out.println( "ячейка с индексом 3 - "+ book[3].getName() + " - " +  book[3].getNumPages());

        for (int i = 0; i < book.length; i++) {
            Book bokk = book[i];
            if(bokk.getName() == "Чистый код"){
                System.out.println("В списке есть такая книга");
                System.out.println(bok.getName() + " - " + bok.getNumPages());
            }
        }
    }
}
