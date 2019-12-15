package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
public void whenSecondMax() {
    MultiMax check = new MultiMax();
    int result = check.max(9, 7, 8);
    assertThat(result, is(9));
}

    @Test
    public void whenSecondMax1() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 8, 7);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 9, 8);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondMax3() {
        MultiMax check = new MultiMax();
        int result = check.max(8, 9, 7);
        assertThat(result, is(9));
    }
    @Test
    public void whenSecondMax4() {
        MultiMax check = new MultiMax();
        int result = check.max(8, 7, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenSecondMax5() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 8, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenSecondMax6() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 9, 9);
        assertThat(result, is(9));
    }
}