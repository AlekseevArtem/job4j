package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        for (int i : coins) {
            while (money - price >= i) {
                money = money - i;
                rsl[size] = i;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}