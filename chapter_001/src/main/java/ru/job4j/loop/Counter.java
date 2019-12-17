package ru.job4j.loop;

public class Counter {
    public static int add(int start, int finish) {
        int sum = 0;
            for (int number = start; number <= finish; number++ ) {
            if (number % 2 !=0){
            continue;}
            sum += number;
        }
        return sum;
    }
}