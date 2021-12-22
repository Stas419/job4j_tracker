package ru.job4j.tracker;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        Function<Integer, Integer> a = o -> 5;

        Consumer<String[]> mainF = StartUI::main;

        List<UserAction> stasList =
                List.of(actions).stream()
                        .filter(action -> action.name().startsWith("Stas"))
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());

        List.of(actions).forEach(out::println);

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
                System.out.println(obj);
            }
        };

        var a = "123";

        Output out1 = System.out::println;

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
