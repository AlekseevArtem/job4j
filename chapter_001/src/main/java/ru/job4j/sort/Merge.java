package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int il = 0, ir = 0, irsl = 0;
        while (irsl < rsl.length && il <= left.length && ir <= right.length) {
            if (right.length == 0 && left.length == 0) {
                break;
            } else if (il == left.length) {
                rsl[irsl] = right[ir];
                ir++;
                irsl++;
            } else if (ir == right.length) {
                rsl[irsl] = left[il];
                il++;
                irsl++;
            } else if (left[il] < right[ir] && left.length - 1 >= il) {
                rsl[irsl] = left[il];
                il++;
                irsl++;
            } else if (left[il] > right[ir] && right.length - 1 >= ir) {
                rsl[irsl] = right[ir];
                ir++;
                irsl++;
            } else {
                rsl[irsl] = left[il];
                if (right.length - 1 >= ir) {
                    ir++;
                } else if (left.length - 1 >= il) {
                    il++;
                }
                irsl++;
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

