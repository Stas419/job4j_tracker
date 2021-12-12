package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== replacement of the application ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== replacement of the application ====");
        int id = input.askInt("Ведите id");
        String name = input.askStr("Введите имя заявки");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Заявка изменена успешно.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return false;
    }
}
