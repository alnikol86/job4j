package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int iWord = word.length-1;
        for (int i = post.length-1; i >= 0; i--) {
            if (word[iWord] != post[i]) {
                result = false;
                break;
            }
            iWord--;
        }
        return result;
    }
}
