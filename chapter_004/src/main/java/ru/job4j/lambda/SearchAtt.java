package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class SearchAtt {
    private static List<Attachment> filter(List<Attachment> to, BiPredicate func, Supplier initValue) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : to) {
            if (func.test(att, initValue.get())) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        BiPredicate<Attachment, Integer> func = new BiPredicate<>() {
            @Override
            public boolean test(Attachment o, Integer o2) {
                return o.getSize() > o2;
            }
        };
        Supplier<Integer> initValue = new Supplier<>() {
            @Override
            public Integer get() {
                return 100;
            }
        };
        return filter(list, func, initValue);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        BiPredicate<Attachment, String> func = new BiPredicate<>() {
            @Override
            public boolean test(Attachment o, String o2) {
                return o.getName().contains(o2);
            }
        };
        Supplier<String> initValue = new Supplier<String>() {
            @Override
            public String get() {
                return "bug";
            }
        };
        return filter(list, func, initValue);
    }
}

