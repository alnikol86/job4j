package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ascStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int ascInt(String question) {
        return Integer.valueOf(ascStr(question));
    }

    @Override
    public int ascInt(String question, int max) {
        int select = ascInt(question);
        if (select < 0 || select > max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}
