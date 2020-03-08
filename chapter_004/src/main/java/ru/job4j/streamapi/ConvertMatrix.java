package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertMatrix {
    public static void main(String[] args) {
        int[][] matrixInt = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        List<List<Integer>> matrix = new ArrayList<>();
        for (int[] mat: matrixInt) {
            List<Integer> temp = new ArrayList<>();
            for (int m : mat) {
                temp.add(m);                                                
            }
            matrix.add(temp);
        }
        System.out.println(
                matrix.stream().flatMap(Collection::stream).collect(Collectors.toList())
        );

    }
}
