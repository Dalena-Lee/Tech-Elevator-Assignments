package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameFirstLastTest {
    @Test
    public void IsItTheSameTest() {
        SameFirstLast test = new SameFirstLast();

        assertEquals(false, test.isItTheSame(new int[] {1, 2, 3}));
        assertEquals(true, test.isItTheSame(new int[] {1, 2, 3, 1}));
        assertEquals(true, test.isItTheSame(new int[] {1, 2, 1}));
        assertEquals(false, test.isItTheSame(new int[] {1, 2}));
        assertEquals(true, test.isItTheSame(new int[] {1, 1}));
        assertEquals(true, test.isItTheSame(new int[] {0, 0}));
        assertEquals(true, test.isItTheSame(new int[] {-1, -1}));
        assertEquals(true, test.isItTheSame(new int[] {1}));
        assertEquals(false, test.isItTheSame(new int[] {}));
        assertEquals(false, test.isItTheSame(null));


    }
}
