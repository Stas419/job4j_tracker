package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== replacement of the application ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== replacement of the application ====");
        int id = input.askInt("Ведите id");
        String name = input.askStr("Введите имя заявки");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
        return false;
    }
}
