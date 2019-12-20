package ru.job4j.array;

/**
 * Class Выдает из массива чисел минимальное значение в заданном диапазоне.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  20.12.2019
 * @version  1
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index < finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}