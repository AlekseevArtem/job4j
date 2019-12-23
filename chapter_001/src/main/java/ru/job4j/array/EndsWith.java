package ru.job4j.array;

/**
 * Class Проверяет равны ли последние ячейки массива с ячейками второго массива.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  19.12.2019
 * @version  1
 */
public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int numw = word.length - 1;
        int nump = post.length - 1;
        for ( ; nump > 0; numw--, nump--) {
            if (word[numw] != post[nump]) {
                result = false;
                break;
            }
        }
        return result;
    }
}