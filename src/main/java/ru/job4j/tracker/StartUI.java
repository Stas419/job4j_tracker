package ru.job4j.tracker;

public class StartUI {

    public StartUI(Output out) {
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
      Output out = new ConsoleOutput();

        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();

        Output out = new ConsoleOutput();
        ValidateInput validateInput = new ValidateInput();

        UserAction[] actions = {
                new CreateAction(out),
                new ShowItems(out),
                new ReplaceAction(out),
                new DeleteItem(out),
                new FindById(out),
                new FindByName(out),
                new ExitProgram(),
                new FindById(out)
        };
        new StartUI(out).init(input, tracker, actions);
    }
}
