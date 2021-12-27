package ru.job4j.tracker;

public class StubInput implements Input {
    private final Output out;

    private final String[] answers;
    private int position = 0;

    public StubInput(Output out, String[] answers) {
        this.out = out;
        this.answers = answers;
    }

    public StubInput(String[] strings) {
        this.answers = strings;
        out = null;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    public Output getOut() {
        return out;
    }
}
