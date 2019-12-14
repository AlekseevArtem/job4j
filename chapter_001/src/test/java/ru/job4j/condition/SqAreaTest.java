package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 30;
        int k = 4;
        int expected = 36;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}