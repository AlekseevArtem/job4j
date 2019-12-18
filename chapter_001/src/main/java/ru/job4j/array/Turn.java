package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int num = 0 ; ((array.length % 2 == 0) && (num < array.length/2)) || ((array.length % 2 != 0) && (num < (array.length - 1)/2)) ; num++) {
            int temporary = array[num];
            array[num] = array[array.length - 1 - num];
            array[array.length - 1 - num] = temporary;
        }
        return array;
    }
}