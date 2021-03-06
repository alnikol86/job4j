package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int minString = Math.min(left.length(), right.length());
        for (int i = 0; i < minString; ++i) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        return rsl == 0 ? Integer.compare(right.length(), left.length()) : rsl;
    }
}