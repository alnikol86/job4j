package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < word.length/2; i++) {
            char temp = word[i];
            word[i] = word[word.length-1-i];
            word[word.length-1-i] = temp;
        }
        for (int i = 0; i < post.length/2; i++) {
            char temp = post[i];
            post[i] = post[post.length-1-i];
            post[post.length-1-i] = temp;
        }
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
