package ru.job4j.array;

/**
 * Class Сортирует любой массив чисел по возрастанию.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  21.12.2019
 * @version  1
 */
public class SortSelected {

    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length; start++) {
            int min = MinDiapason.findMin(data, start, data.length);
            int index = FindLoop.indeinrangeOf(data, min, start, data.length);

            if (index != start) {
            int temporary = data[start];
            data[start] = data[index];
            data[index] = temporary;
            }
        }
        return data;
    }
}