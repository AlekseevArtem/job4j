package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;

public class StudentTest {
    private List<Student> attachments = Arrays.asList(
            new Student("Petrov", "KI - 20", 99),
            new Student("Ivanov", "KH - 17", 34),
            new Student("Sidorov", "KH - 17", 67)
    );

    @Test
    public void mapCollectionOfStudents() {
        Map<String, Student> result = Student.collect(attachments);
        Map<String, Student> expect = new HashMap<>() {
            {
                put("Petrov", new Student("Petrov", "KI - 20", 99));
                put("Ivanov", new Student("Ivanov", "KH - 17", 34));
                put("Sidorov", new Student("Sidorov", "KH - 17", 67));

            }
        };
        Assert.assertThat(result, is(expect));
    }
}
