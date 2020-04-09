package ru.job4j.array;

public class MatrixCheck3 {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[board.length - 1][0] != board[i][board.length - 1 - i]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
