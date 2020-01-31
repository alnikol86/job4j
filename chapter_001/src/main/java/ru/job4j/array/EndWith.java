package ru.job4j.array;

/**
 * Class checks in array a postfix
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class EndWith {
    /**
     * Method find a postfix in a word
     * @param word input the word
     * @param post input the postfix
     * @return boolean there is or not
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int iWord = word.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[iWord] != post[i]) {
                result = false;
                break;
            }
            iWord--;
        }
        return result;
    }
}
