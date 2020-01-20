package ru.job4j.sort;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess2() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 5};
        int[] result = algo.merge(
                new int[] {3, 4, 5},
                new int[] {1, 2}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenSame() {
        Merge algo = new Merge();
        int[] expect = {1, 1, 2, 2, 3, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3, 4},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenRightLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {3, 4},
                new int[] {1, 2, 3}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenRightLess2() {
        Merge algo = new Merge();
        int[] expect = {1, 1, 2, 2, 3};
        int[] result = algo.merge(
                new int[] {1, 1},
                new int[] {2, 2, 3}
        );
        assertThat(result, is(expect));
    }
}