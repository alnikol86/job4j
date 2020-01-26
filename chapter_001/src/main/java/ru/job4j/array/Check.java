package ru.job4j.array;

/**
 * Class Check does check an array to false or true
 * @author Alexander Nikolaev
 * @since January 21, 2020
 * @version 1.0
 */
public class Check {
    /**
     * it checks true or false all elements in an array
     * @param data input array
     * @return true or false all elements
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
            }
        }
        return result;
    }
}
