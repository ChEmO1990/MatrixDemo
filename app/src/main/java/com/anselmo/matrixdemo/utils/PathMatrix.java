package com.anselmo.matrixdemo.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by chemo on 10/4/17.
 */

public class PathMatrix {
    private int matrix[][];
    private boolean isPathFull;

    public PathMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int solve(int m, int n) {
        if( n == 0 ) {
            int minN = matrix[0][0];

            for( int i = 0; i < m; i++ ) {
                if( matrix[i][0] < minN ) {
                    minN = matrix[i][0];
                }
            }

            isPathFull = false;

            return minN;
        }

        int i, j;
        int tc[][] = new int[m+1][n+1];

        tc[0][0] = matrix[0][0];

        for (i = 1; i <= m; i++) {
            tc[i][0] = tc[i-1][0] + matrix[i][0];
        }

        for (j = 1; j <= n; j++) {
            tc[0][j] = tc[0][j-1] + matrix[0][j];
        }

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                tc[i][j] = min( tc[i-1][j-1], tc[i-1][j], tc[i][j-1] ) + matrix[i][j];
            }
        }

        if( tc[m][n] <= 50 ) {
            isPathFull = true;
        } else {
            isPathFull = true;
        }

        return tc[m][n];
    }


    private static int min( int x, int y, int z ) {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }

    public boolean isPathFull() {
        return isPathFull;
    }

    public int getRowCount() {
        return this.matrix.length;
    }

    public int getColumnCount() {
        return this.matrix[0].length;
    }
}