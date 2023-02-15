package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxEnd3Test {

    @Test
    public void isArrayCorrect() {
        MaxEnd3 test = new MaxEnd3();

        assertArrayEquals(new int[] {3,3,3}, test.makeArray(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {11,11,11,11}, test.makeArray(new int[] {11, 5, 9, 2}));
        assertArrayEquals(new int[] {3,3,3}, test.makeArray(new int[] {2, 11, 3}));
        assertArrayEquals(new int[] {11,11}, test.makeArray(new int[] {2, 11}));
        assertArrayEquals(new int[] {222222222,222222222,222222222}, test.makeArray(new int[] {222222222, 11, 2}));
        assertArrayEquals(new int[] {2,2,2}, test.makeArray(new int[] {2, 0, 1}));
        assertArrayEquals(new int[] {0,0,0}, test.makeArray(new int[] {-5, -2, 0}));

    }
}
