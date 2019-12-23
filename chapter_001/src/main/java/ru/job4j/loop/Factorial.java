package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int start = 1; start <= n; start++) {
            result *= start;
        }
        return result;
    }
}