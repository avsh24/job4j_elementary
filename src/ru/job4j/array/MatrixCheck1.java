package ru.job4j.array;

public class MatrixCheck1 {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[column][i] > 'X') {
                    result = false;
                    break;
            }
        }
        return result;
    }
}
