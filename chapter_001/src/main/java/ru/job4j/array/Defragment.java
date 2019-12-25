package ru.job4j.array;

/**
 * Class Все null из текста переносит в конец.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  23.12.2019
 * @version  1
 */
public class Defragment {

    public static String[] compress(String[] array) {
        int num = 0;
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int ii = index;
                num++;
                while ((array[ii] == null) && (ii < array.length - num)) {
                    array[ii] = array[ii + 1];
                    array[ii + 1] = null;
                    ii++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}