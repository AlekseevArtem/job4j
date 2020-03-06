package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    private static List<Attachment> filter(List<Attachment> to, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : to) {
            if (func.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        return filter(list, o -> o.getSize() > 100);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        return filter(list, o -> o.getName().contains("bug"));
    }
}

