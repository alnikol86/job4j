package ru.job4j.array;

/**
 * Class checks in array, there is element or not
 * @author Alexander Nikolaev
 * @version 1.0
 */
public class ArrayChar {
    /**
     * Method is finding prefix in a first part into a word
     * @param word it is the word for finding
     * @param pref it is the prefix for finding
     * @return boolean result, it found or not
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
                if (pref[i] != word[i]) {
                    result = false;
                    break;
            }
        }
        return result;
    }
}
