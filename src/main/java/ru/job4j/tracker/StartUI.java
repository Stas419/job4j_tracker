package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions ) {
        boolean run = true ;
        while (run) {
            showMenu();
            int select = input.askInt("Введите id: ");
            if (select == 0){
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
            else if (select == 1) {
                StartUI.showItem(input, tracker);
            }
            else if(select == 2){
                StartUI.replaceItem(input, tracker);
            }
            else if(select == 3){
                StartUI.deleteItem(input, tracker);
            }
            else if(select == 4){
                StartUI.findIdItem(input, tracker);
            }
            else if(select == 5){
                StartUI.findNameItem(input, tracker);
            }
            else if(select == 6){
                run = false;
            }
        }
    }
    public static void createItem(Input input, Tracker tracker){
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Введите name:");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void showItem(Input input, Tracker tracker){
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void replaceItem(Input input, Tracker tracker){
        System.out.println("=== replacement of the application ====");
        int id = input.askInt("Ведите id");
        String name = input.askStr("Введите имя заявки");
        Item item = new Item(name);
        if (tracker.replace(item, id)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker){
        System.out.println("=== Delete item ====");
        int id = input.askInt("Введите id:");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    public static void findIdItem(Input input, Tracker tracker){
        System.out.println("=== Find item by id ====");
        int id = input.askInt("Введите id:");
        Item item = tracker.findById(id);
        if(item != null){
            System.out.println(item);
        } else{
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void findNameItem(Input input, Tracker tracker){
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Введите name:");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    private void showMenu() {
        String[] menu = {"Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"};
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + "." + menu[i]);
        }
    }

    public static void main(String[] args) {
        UserAction[] actions = {new CreateAction()};
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker, actions);

    }
}
