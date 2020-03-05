package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] array1 = o1.split("/");
        String[] array2 = o2.split("/");
        int result = 0;
        int size = Math.min(array1.length, array2.length);
        for (int index = 0; index < size; index++) {
            if (!array1[index].equals(array2[index])) {
                result = array2[index].compareTo(array1[index]);
                break;
            }
        }
        if (result == 0 && array1.length != array2.length) {
            result = Integer.compare(array1.length, array2.length);
        }
        return result;
    }
}
