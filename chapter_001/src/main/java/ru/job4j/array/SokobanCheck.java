package ru.job4j.array;

/**
 * Class Проверяет выигрышную ситуацию в игре сокобан.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  23.12.2019
 * @version  1
 */
public class SokobanCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int i = 0;
        int j = 0;
        for ( ; i < board.length; i++, j++) {
            if (monoHorizontal(board, i) || monoVertical(board, j)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] board, int index) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[index][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static boolean monoVertical(char[][] board, int index) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
