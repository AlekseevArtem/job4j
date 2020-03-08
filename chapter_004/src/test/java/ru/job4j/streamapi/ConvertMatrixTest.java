package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class ConvertMatrixTest {
    @Test
    public void testConvertMatrix() {
        Integer[][] matrixInt = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        List<Integer> result = ConvertMatrix.convert(matrixInt);

        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
        );
        Assert.assertThat(result, is(expect));
    }
}
