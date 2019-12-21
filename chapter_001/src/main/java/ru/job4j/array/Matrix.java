package ru.job4j.array;

/**
 * Class Делает таблицу умножения (матрицу) любого размера.
 * @author AlekseevArtem (tema9991@mail.ru)
 * @since  21.12.2019
 * @version  1
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for ( int i = 0 ; i < table.length; i++ )
            for( int j = 0; j < table.length; j++)
                table [i][j] = (i + 1) * (j + 1);
        return table;
    }
}