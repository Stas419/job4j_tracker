package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StubInput implements Input {
    private final Output out;

    private final List<String> answers;
    private int position = 0;

    public StubInput(Output out, List<String> answers) {
        this.out = out;
        this.answers = answers;
    }

    public StubInput(List<String> strings) {
        this.answers = strings;
        out = null;
    }

    @Override
    public String askStr(String question) {
        return answers.get(position++);
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    public Output getOut() {
        return out;
    }
}
