package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import java.util.stream.Collectors;

public class ConvertMatrix {
    static List<Integer> convert(Integer[][] matrixInt) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (Integer[] mat: matrixInt) {
            List<Integer> list = new ArrayList<>();
            for (Integer integer: mat) {
                list.add(integer);
            }
            matrix.add(list);
        }
        return matrix.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
