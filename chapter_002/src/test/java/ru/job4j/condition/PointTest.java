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

    @Test
    public void distance3d5() {
        Point a = new Point(0, 0, 5);
        Point b = new Point(0, 0, 0);
        double expected = 5;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d6() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 7);
        double expected = 6;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}
