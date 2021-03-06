package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SokobanCheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = SokobanCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = SokobanCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = SokobanCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue1() {
        char[][] input = {
                {'X', ' ', 'X', ' ', 'X'},
                {' ', 'X', ' ', 'X', ' '},
                {'X', 'X', ' ', 'X', 'X'},
                {' ', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        boolean result = SokobanCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataHMonoByTrueThenFalse() {
        char[][] input = {
                {'X', ' ', 'X', ' ', 'X'},
                {' ', 'X', ' ', 'X', ' '},
                {'X', 'X', ' ', 'X', 'X'},
                {' ', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', 'X', 'X'},
        };
        boolean result = SokobanCheck.isWin(input);
        assertThat(result, is(false));
    }
}
