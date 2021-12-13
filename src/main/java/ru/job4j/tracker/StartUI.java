package ru.job4j.tracker;
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        Output out = new ConsoleOutput() {
            @Override
            public void println(Object obj) {
            }
        };
        UserAction[] actions = {
                new CreateAction(out),
                new ShowItems(out),
                new ReplaceAction(out),
                new DeleteItem(out),
                new FindById(out),
                new FindByName(out),
                new ExitProgram()
        };
        new StartUI(out).init(input, tracker, actions);
    }
}
