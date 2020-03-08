package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>(
                Set.of(
                        "Lada",
                        "BMW",
                        "Volvo",
                        "Toyota"
                )
        );
        for (String name : autos) {
            System.out.println(name);
        }
    }
}