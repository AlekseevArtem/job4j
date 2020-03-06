package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class SchoolTest {
    private List<Student> attachments = Arrays.asList(
            new Student(99),
            new Student(34),
            new Student(67),
            new Student(10),
            new Student(55),
            new Student(78),
            new Student(58)
    );

    @Test
    public void schoolClassA() {
        List<Student> result = School.collect(attachments, st -> st.getScore() >= 0 && st.getScore() < 50);
        List<Student> expect = Arrays.asList(
                new Student(34),
                new Student(10)
        );
        Assert.assertThat(result, is(expect));
    }

    @Test
    public void schoolClassB() {
        List<Student> result = School.collect(attachments, st -> st.getScore() >= 50 && st.getScore() < 75);
        List<Student> expect = Arrays.asList(
                new Student(67),
                new Student(55),
                new Student(58)
        );
        Assert.assertThat(result, is(expect));
    }

    @Test
    public void schoolClassC() {
        List<Student> result = School.collect(attachments, st -> st.getScore() >= 75 && st.getScore() <= 100);
        List<Student> expect = Arrays.asList(
                new Student(99),
                new Student(78)
        );
        Assert.assertThat(result, is(expect));
    }
}
