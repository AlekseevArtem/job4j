package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int il = 0, ir = 0, irsl = 0;
        while (irsl < rsl.length && il <= left.length && ir <= right.length) {
            if (left.length == 0) {
                for ( ; ir < right.length; ir++, irsl++) {
                    rsl[irsl] = right[ir];
                }
            } else if (right.length == 0) {
                for ( ; il < left.length; il++, irsl++) {
                    rsl[irsl] = right[il];
                }
            } else if (right[ir] <= left[il]) {
                rsl[irsl] = right[ir];
                ir++;
                irsl++;
                if (ir == right.length) {
                    ir--;
                    for ( ; il < left.length; il++, irsl++) {
                        rsl[irsl] = left[il];
                    }
                }
            } else if (left[il] <= right[ir]) {
                rsl[irsl] = left[il];
                il++;
                irsl++;
                if (il == left.length) {
                    il--;
                    for ( ; ir < right.length; ir++, irsl++) {
                        rsl[irsl] = right[ir];
                    }
                }
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

