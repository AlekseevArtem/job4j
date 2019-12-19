package ru.job4j.array;

/**
 * Class Проверяет равны ли начальные ячейки массива с ячейками второго массива.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  18.12.2019
 * @version  1
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for ( int num = 0 ; num < pref.length ;num++ ) {
            if (word[num] != pref[num]) {
                result = false;
                break;
            }
        }
        return result;
    }
}