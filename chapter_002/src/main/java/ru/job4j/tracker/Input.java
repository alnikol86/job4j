package ru.job4j.tracker;

public interface Input {
    String ascStr(String question);

    int ascInt(String question);

    int ascInt(String question, int max);
}
