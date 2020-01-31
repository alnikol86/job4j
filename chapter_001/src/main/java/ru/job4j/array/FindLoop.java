package ru.job4j.array;

/**
 * Class find elements in array
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class FindLoop {
    /**
     * Method find an element in an array
     * @param data input an array
     * @param el input an element
     * @return index the element in array
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method find an element in a range
     * @param data input array
     * @param el input element
     * @param start range
     * @param finish range
     * @return index in array, if element there is
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
