package ru.job4j.array;

/**
 * Class находит значение в массиве и возвращает позицию первого попавшегося значения.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  18.12.2019
 * @version  1
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexRange(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}