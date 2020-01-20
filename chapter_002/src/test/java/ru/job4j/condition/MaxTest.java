package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax5OutOf2() {
        int result = Max.max(2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax4OutOf3() {
        int result = Max.max(2, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax7OutOf4() {
        int result = Max.max(3, 2, 7, 4);
        assertThat(result, is(7));
    }
}