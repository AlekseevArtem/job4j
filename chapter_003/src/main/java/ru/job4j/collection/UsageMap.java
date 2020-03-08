package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(
                Map.of(
                        "parsentev@yandex.ru", "Petr Arsentev",
                        "parsentev@yandex.ru", "Petr Arsentev Sergeevich",
                        "tema9991@mail.ru", "Artem Alekseev",
                        "johnsmith@mail.ru", "John Smith"
                )
        );
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("E-mail: " + key + ", Owner = " + value);
        }
    }
}
