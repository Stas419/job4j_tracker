package ru.job4j.tracker;

import java.util.Objects;

public class FindById implements UserAction {
    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @SuppressWarnings("checkstyle:LineLength")
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int id = input.askInt("Enter id:");
        Item item = tracker.findById(id);
        out.println(Objects.requireNonNullElseGet(item, () ->
                "Заявка с введенным id: " + id + " не найдено"));
        return true;
    }
}
