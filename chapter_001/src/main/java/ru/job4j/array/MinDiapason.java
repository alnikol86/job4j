package ru.job4j.array;

/**
 * Class find a minimum number in an array
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class MinDiapason {
    /**
     * Method find a minimum number in an array
     * @param array input array
     * @param start first index in the array
     * @param finish it is length the array
     * @return the minimum number
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
