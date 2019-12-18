package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int num = 1 ; num <= bound; num++ ) {
            rst [num - 1] = num * num;
        }
        return rst;
    }
}