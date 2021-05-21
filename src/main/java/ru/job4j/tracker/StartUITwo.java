package ru.job4j.tracker;

import java.util.Scanner;

public class StartUITwo {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            /* if */
        }
    }

    private void showMenu() {
        System.out.println("Menu." +
                "0. Add new Item\n" +
                "        1. Show all items\n" +
                "        2. Edit item\n" +
                "        3. Delete item\n" +
                "        4. Find item by Id\n" +
                "        5. Find items by name\n" +
                "        6. Exit Program\n" +
                "        Select:");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        StartUITwo startUITwo = new StartUITwo();
        System.out.println("выберите пункт меню");
        new StartUITwo().init(scanner, tracker);
        startUITwo.showMenu();
        int select = Integer.valueOf(scanner.nextLine());
    }
}
