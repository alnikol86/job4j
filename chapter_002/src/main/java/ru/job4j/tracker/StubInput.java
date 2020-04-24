package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ascStr(String question) {
        return answers[position++];
    }

    @Override
    public int ascInt(String question) {
        return Integer.valueOf(ascStr(question));
    }

    @Override
    public int ascInt(String question, int max) {
        int select = ascInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}