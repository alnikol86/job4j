package ru.job4j.array;

/**
 * Class calculate a square
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class Square {
    /**
     * Method calculate square in foursquare
     * @param bound a size one of side
     * @return square, size by size
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
