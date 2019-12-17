package ru.job4j.loop;


public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = true;
        for (int num = 2; num < finish; num++) {
            if ((finish % num) == 0) {
                prime = false;
            }
        }
        if (finish == 1) prime = false;
        return prime;
    }
}