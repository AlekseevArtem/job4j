package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (; start < end; start++) {
            result.add(func.apply((double) start));
        }
        return result;
    }
}
