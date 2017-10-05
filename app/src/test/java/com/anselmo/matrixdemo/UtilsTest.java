package com.anselmo.matrixdemo;
import com.anselmo.matrixdemo.utils.Utils;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
/**
 * Created by chemo on 10/4/17.
 */

public class UtilsTest {
    @Test
    public void checkArrayTitles() {
        assertThat(Utils.TITLES, equalTo(new int[] { R.string.title_1,R.string.title_2,R.string.title_3,R.string.title_4,R.string.title_5  }));
    }

    @Test
    public void checkMatrix1() {
        assertArrayEquals(Utils.MATRIX_EXAMPLE_1, new int[][] {
                        { 3, 4, 1, 2, 8, 6 },
                        { 6, 1, 8, 2, 7, 4 },
                        { 5, 9, 3, 9, 9, 5 },
                        { 8, 4, 1, 3, 2, 6 },
                        { 3, 7, 2, 8, 6, 4 }
        }
        );
    }

    @Test
    public void checkMatrix2() {
        assertArrayEquals(Utils.MATRIX_EXAMPLE_2, new int[][] {
                { 3, 4, 1, 2, 8, 6 },
                { 6, 1, 8, 2, 7, 4 },
                { 5, 9, 3, 9, 9, 5 },
                { 8, 4, 1, 3, 2, 6 },
                { 3, 7, 2, 1, 2, 3 }
                }
        );
    }

    @Test
    public void checkMatrix3() {
        assertArrayEquals(Utils.MATRIX_EXAMPLE_3, new int[][] {
                { 19, 10, 19, 10, 19 },
                { 21, 23, 20, 19, 12 },
                { 20, 12, 20, 11, 10 }
                }
        );
    }

    @Test
    public void checkMatrix4() {
        assertArrayEquals(Utils.MATRIX_EXAMPLE_4, new int[][] {
                { 5, 8, 5, 3, 5 }
                }
        );
    }

    @Test
    public void checkMatrix5() {
        assertArrayEquals(Utils.MATRIX_EXAMPLE_5, new int[][] {
                { 5 },
                { 8 },
                { 5 },
                { 3 },
                { 5 }
                }
        );
    }

}
