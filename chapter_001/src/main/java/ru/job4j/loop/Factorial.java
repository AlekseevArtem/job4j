package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int start = 0; start <= n; start++ ) {
            if (start ==0){
                continue;}
            result *= start;
        }
        return result;
    }
}