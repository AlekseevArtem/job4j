package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenZero() {
        Fact test = new Fact();
        test.calc(0);
    }

    @Test
    public void whenFive() {
        Fact temp = new Fact();
        int result = temp.calc(5);
        assertThat(result, is(11));
    }
}
