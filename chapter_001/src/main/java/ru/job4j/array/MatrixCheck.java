package ru.job4j.array;

/**
 * @author Alexander Nikolaev
 * @since January 26, 2020
 * @version 1.0
 */
public class MatrixCheck {
    /**
     * Class cheks one horizontal line to the same elements
     * @param board input array
     * @param row this number is a horizontal line in the array
     * @return boolean result, the same or not
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
            }
        }
        return result;
    }

    /**
     * Class cheks one vertical line to the same elements
     * @param board input array
     * @param column this number is a vertical column in the array
     * @return boolean result, the same or not
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
            }
        }
        return result;
    }
}
