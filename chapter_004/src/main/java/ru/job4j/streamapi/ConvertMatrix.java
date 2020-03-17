package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class ConvertMatrix {
    static List<Integer> convert(Integer[][] matrixInt) {
        return Arrays.stream(matrixInt).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
