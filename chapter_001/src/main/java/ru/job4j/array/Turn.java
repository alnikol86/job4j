package ru.job4j.array;

/**
 * Class Turn for the reverse array
 * @author Alexander Nikolaev
 * @since January 21, 2020
 * @version 1.0
 */
public class Turn {
    /**
     * reverse array
     * @param array input array
     * @return reverse array
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }
}
