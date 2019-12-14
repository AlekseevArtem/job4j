package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 190;
        double expected = 103.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        int in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}