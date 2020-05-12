package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task value : list) {
            String rsl = value.getNumber();
            numbers.add(rsl);
        }
        return numbers;
    }
}
