package ru.job4j.tracker;

import java.util.ArrayList;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        ArrayList<Item> mas = (ArrayList<Item>) tracker.findByName(name);
        if (mas.size() > 0) {
            for (Item item : mas) {
                out.println(item);
            }
        } else {
            out.println("заявки по введенному имени " + name + " не найдены.");
        }
        return true;
    }
}
