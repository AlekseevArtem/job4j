package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int result = Counter.add(0, 10);
        assertThat(result, is(30));
    }
    @Test
    public void whenSumEvenNumbersFromOneToTwentyThenHundredten() {
        int result = Counter.add(0, 20);
        assertThat(result, is(110));
    }
}