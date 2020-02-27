package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            char leftChar = left.charAt(index);
            char rightChar = right.charAt(index);
            if (leftChar != rightChar) {
                result = Character.compare(leftChar, rightChar);
                break;
            }
        }
        if (result == 0 && left.length() != right.length()) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}