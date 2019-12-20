package ru.job4j.array;

/**
 * Class Выдает из массива чисел минимальное значение.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  18.12.2019
 * @version  1
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}