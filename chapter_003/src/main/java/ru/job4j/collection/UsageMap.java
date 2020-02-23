package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("tema9991@mail.ru", "Artem Alekseev");
        map.put("johnsmith@mail.ru", "John Smith");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("E-mail: " + key + ", Owner = " + value);
        }
    }
}
