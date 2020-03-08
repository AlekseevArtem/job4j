package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                List.of(
                        "Petr",
                        "Ivan",
                        "Stepan"
                )
        );
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
