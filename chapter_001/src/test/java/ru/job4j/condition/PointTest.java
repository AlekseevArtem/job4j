package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 0;
        double expected = 4.24;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1() {
        int x1 = 5;
        int y1 = 32;
        int x2 = 2;
        int y2 = 3;
        double expected = 29.15;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
