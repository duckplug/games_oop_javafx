package ru.job4j.puzzle;

public class Win {
    public static boolean check(char[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X') && (monoHorizontal(board, i) || monoVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }



    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;

            }
        }
        return result;
    }

}