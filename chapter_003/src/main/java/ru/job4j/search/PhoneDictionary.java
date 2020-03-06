package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> surname = n -> n.getSurname().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (surname.
                    or(n -> n.getPhone().contains(key)).
                    or(n -> n.getAddress().contains(key)).
                    or(n -> n.getName().contains(key)).
                    test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
