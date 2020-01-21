package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - 1; i >= 0; i--) {
            for (int i1 = post.length - 1; i1 < ??? ; i1--) {
                if (post[i1] != word[i]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
