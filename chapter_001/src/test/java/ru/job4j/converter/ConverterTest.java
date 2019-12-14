package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 210;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 600;
        int expected = 10;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 12;
        int expected = 720;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        int in = 12;
        int expected = 840;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

}