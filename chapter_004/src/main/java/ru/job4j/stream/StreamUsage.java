package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = -5; i < 6; i++) {
            integers.add(i);
        }
        List<Integer> positiveInt = integers.stream().filter(
                integer -> integer >= 0
        ).collect(Collectors.toList());

        for (Integer res : positiveInt) {
            System.out.println(res);
        }
    }
}