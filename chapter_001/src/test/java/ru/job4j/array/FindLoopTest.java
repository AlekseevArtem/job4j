package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then5() {
        int[] input = new int[]{5, 10, 3, 4, 3, 6, 6, 6, 6};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2ThenMinus1() {
        int[] input = new int[]{5, 10, 3, 4, 3, 6, 4};
        int value = 2;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexRange(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindMinusOne() {
        int[] input = new int[] {5, 2, 10, 2, 4, 2, 10, 7, 4};
        int value = 7;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexRange(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind7() {
        int[] input = new int[] {5, 2, 10, 2, 4, 2, 10, 7, 4};
        int value = 7;
        int start = 3;
        int finish = 8;
        int result = FindLoop.indexRange(input, value, start, finish);
        int expect = 7;
        assertThat(result, is(expect));
    }
}