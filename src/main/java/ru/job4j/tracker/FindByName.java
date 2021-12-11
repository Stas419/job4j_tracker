package ru.job4j.tracker;
public class FindByName implements UserAction {
    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] mas = tracker.findByName(name);
        if (mas.length > 0) {
            for (Item item : mas) {
                System.out.println(item);
            }
        } else {
            System.out.println("заявки по введенному имени " + name + " не найдены.");
        }
        return true;
    }
}
