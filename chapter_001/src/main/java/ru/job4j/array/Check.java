package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int num = 1 ; num < data.length; num++ ) {
            if (data [0] != data [num]) result = false;
            }
        return result;
    }
}