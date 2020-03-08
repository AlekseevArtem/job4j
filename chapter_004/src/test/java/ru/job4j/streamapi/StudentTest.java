package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;

public class StudentTest {
    private List<Student> attachments = new ArrayList<>(
            List.of(
                    new Student("Petrov", "KI - 20", 99),
                    new Student("Ivanov", "KH - 17", 34),
                    new Student("Sidorov", "KH - 17", 67)
            )
    );

    @Test
    public void mapCollectionOfStudents() {
        Map<String, Student> result = Student.collect(attachments);
        Map<String, Student> expect = new HashMap<>(
                Map.of(
                        "Petrov", new Student("Petrov", "KI - 20", 99),
                        "Ivanov", new Student("Ivanov", "KH - 17", 34),
                        "Sidorov", new Student("Sidorov", "KH - 17", 67)

                ));
        Assert.assertThat(result, is(expect));
    }

    @Test
    public void levelOf() {
        List<Student> result = Student.levelOf(attachments, 70);
        List<Student> expect = new ArrayList<>(
                List.of(
                new Student("Ivanov", "KH - 17", 34),
                new Student("Sidorov", "KH - 17", 67)
        ));
        Assert.assertThat(result, is(expect));
    }
}
