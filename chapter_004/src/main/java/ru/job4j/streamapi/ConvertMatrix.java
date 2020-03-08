package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import java.util.stream.Collectors;

public class ConvertMatrix {
    static List<Integer> convert(Integer[][] matrixInt) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (Integer[] mat: matrixInt) {
            matrix.add(new ArrayList<>(Arrays.asList(mat)));
        }
        return matrix.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
