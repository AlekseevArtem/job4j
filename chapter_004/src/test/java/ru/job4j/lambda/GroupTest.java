package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void check() {
        List<Student> students = Arrays.asList(
                new Student("Vasya", new HashSet<>(Arrays.asList("Football", "Volleyball"))),
                new Student("Petr", new HashSet<>(Collections.singletonList("Skiing"))),
                new Student("Dima", new HashSet<>(Arrays.asList("Football", "Baseball")))
        );
        Map<String, Set<String>> result = Group.sections(students);
        Map<String, Set<String>> expect = new HashMap<>(
                Map.of(
                        "Football", new HashSet<>(Arrays.asList("Vasya", "Dima")),
                        "Volleyball", new HashSet<>(Collections.singletonList("Vasya")),
                        "Skiing", new HashSet<>(Collections.singletonList("Petr")),
                        "Baseball", new HashSet<>(Collections.singletonList("Dima"))
                ));
        assertThat(result, is(expect));
    }

}
