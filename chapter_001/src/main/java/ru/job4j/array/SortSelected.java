package ru.job4j.array;

/**
 * Class does sort array at a minimum number to a maximum number
 * @author Alexander Nikolaev
 * @since January 24, 2020
 * @version 1.0
 */
public class SortSelected {
    /**
     * Method sorts an array from MIN to MAX an element
     * @param data input array
     * @return sorted array
     */
    public static int[] sort(int[] data) {
        FindLoop find = new FindLoop();
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = find.indexOf(data, min, start, data.length - 1);
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
            start++;
        }
        return data;
    }
}
