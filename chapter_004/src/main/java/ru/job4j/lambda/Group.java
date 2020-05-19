package ru.job4j.lambda;

import java.util.*;
import java.util.stream.*;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(student -> student.getUnits().stream()
                .map(unit -> new Holder(unit, student.getName())))
                .collect(
                        Collectors.groupingBy(t -> t.key,
                                Collector.of(
                                        HashSet::new,
                                        (set, el) -> set.add(el.value),
                                                (left, right) -> {
                                            left.addAll(right); return left; }
                                )
                        )
                );
    }

    static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}