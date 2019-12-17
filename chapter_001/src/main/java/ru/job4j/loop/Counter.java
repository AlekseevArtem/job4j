package ru.job4j.loop;

public class Counter {
    public static int add(int start, int finish) {
        int sum = 0;
            for (int number = start; (number % 2 ==0) && (number <= finish); number += 2 ) {
                sum += number;
            }
        return sum;
    }
}