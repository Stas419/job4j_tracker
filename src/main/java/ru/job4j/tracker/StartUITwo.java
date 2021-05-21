package ru.job4j.tracker;

import java.util.Scanner;

public class StartUITwo {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                if(select == 1){
                    Item[] item2 = new Item[10];
                    Item[] list = tracker.findAll(item2);
                        System.out.println(list.toString());
                }

                if(select == 2){
                    System.out.println("введите id который хотите изменить");
                    int id = Integer.parseInt(scanner.nextLine());
                    tracker.findById(id);
                    Item item1 = new Item();
                    tracker.replace(item1, id);
                }

                if(select == 3){

                }


                /*            } else if (...) { */
                /*             Добавить остальные действия системы по меню. */
            } else if (select == 6) {
                run = false;
            }
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
