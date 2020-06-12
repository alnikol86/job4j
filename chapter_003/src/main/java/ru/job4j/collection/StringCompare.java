package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int iterations = 0;
        int mainString = Integer.compare(left.length(), right.length());
        if (mainString <= 0) {
            iterations = left.length();
        } else {
            iterations = right.length();
        }
        for (int i = 0; i < iterations; ++i) {
            char first = left.charAt(i);
            char second = right.charAt(i);
            rsl = Character.compare(first, second);
            if (rsl < 0 || rsl > 0) {
                break;
            }
            if (mainString < 0 && rsl == 0) {
                rsl = -1;
            } else if (mainString > 0 && rsl == 0) {
                rsl = 1;
            }
        }
        return rsl;
    }
}
