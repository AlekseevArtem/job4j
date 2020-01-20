package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void exist() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(0, 3);
        Triangle dd = new Triangle(first, second, third);
        double expected = 4.5;
        double out = dd.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void notExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 10);
        Triangle dd = new Triangle(first, second, third);
        double expected = -1;
        double out = dd.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}
