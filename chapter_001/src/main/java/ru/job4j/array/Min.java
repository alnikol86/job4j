package ru.job4j.array;

/**
 * @author Alexander Nikolaev
 * @since January 23, 2020
 * @version 1.0
 */
public class Min {
    /**
     * Class does find a min element in an array
     * @param array input array
     * @return min element
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
