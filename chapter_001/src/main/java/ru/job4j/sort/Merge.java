package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int il = 0, ir = 0;
        while (ir + il < rsl.length && il <= left.length && ir <= right.length) {
            if (il == left.length) {
                rsl[ir + il] = right[ir];
                ir++;
            } else if (ir == right.length) {
                rsl[ir + il] = left[il];
                il++;
            } else if (left[il] < right[ir] && left.length - 1 >= il) {
                rsl[ir + il] = left[il];
                il++;
            } else {
                rsl[ir + il] = right[ir];
                ir++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

