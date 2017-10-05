package com.anselmo.matrixdemo.utils;

import android.content.Context;
import android.sax.RootElement;

import com.anselmo.matrixdemo.R;

/**
 * Created by chemo on 10/4/17.
 */

public class Utils {
    public static int[][] MATRIX_EXAMPLE_1 = {
            { 3, 4, 1, 2, 8, 6 },
            { 6, 1, 8, 2, 7, 4 },
            { 5, 9, 3, 9, 9, 5 },
            { 8, 4, 1, 3, 2, 6 },
            { 3, 7, 2, 8, 6, 4 }
    };

    public static int[][] MATRIX_EXAMPLE_2 = {
            { 3, 4, 1, 2, 8, 6 },
            { 6, 1, 8, 2, 7, 4 },
            { 5, 9, 3, 9, 9, 5 },
            { 8, 4, 1, 3, 2, 6 },
            { 3, 7, 2, 1, 2, 3 }
    };

    public static int[][] MATRIX_EXAMPLE_3 = {
            { 19, 10, 19, 10, 19 },
            { 21, 23, 20, 19, 12 },
            { 20, 12, 20, 11, 10 }
    };

    public static int[][] MATRIX_EXAMPLE_4 = {
            { 5, 8, 5, 3, 5 }
    };

    public static int[][] MATRIX_EXAMPLE_5 = {
            { 5 },
            { 8 },
            { 5 },
            { 3 },
            { 5 }
    };

    public static int[] TITLES = {
            R.string.title_1,
            R.string.title_2,
            R.string.title_3,
            R.string.title_4,
            R.string.title_5,
    };

    public static String printMatrix(int matrix[][]) {
        String stringMatrix = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                stringMatrix += " |" + matrix[row][col] + "| ";
            }
            stringMatrix += "\n";
        }
        return stringMatrix;
    }
}
