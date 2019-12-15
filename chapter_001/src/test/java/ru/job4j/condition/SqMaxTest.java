package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMax1() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2() {
        int result = SqMax.max(5, 2, 3, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3() {
        int result = SqMax.max(4, 6, 3, 4);
        assertThat(result, is(6));
    }
}