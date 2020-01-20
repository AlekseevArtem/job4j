package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(2, 3);
        Point b = new Point(5, 0);
        double expected = 4.24;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }


}
