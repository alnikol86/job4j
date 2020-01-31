package ru.job4j.array;

/**
 * Class defragments an array,
 * a cell with a data in start and the cell with Null to finish
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class Defragment {
    /**
     * Method does a defragmentation
     * @param array input array
     * @return defragmented array
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                String nullData = array[index];
                int tempNull = index;
                while (array[index] == null && index < array.length - 1) {
                    index++;
                }
                String data = array[index];
                array[tempNull] = data;
                array[index] = nullData;
                index = tempNull;
            }
        }
        return array;
    }
}
