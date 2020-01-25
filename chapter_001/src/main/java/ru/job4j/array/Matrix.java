package ru.job4j.array;

/**
 * @author Alexander Nikolaev
 * @since January 25, 2020
 * @version 1.0
 */
public class Matrix {
    /**
     * Class creates a multiplication table
     * @param size to set size a 2D array
     * @return a multiplication table
     */
    public int[][] multiple (int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
