package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            for (int i1 = i; i1 <= i; i1++) {
                if (pref[i] != word[i1]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
