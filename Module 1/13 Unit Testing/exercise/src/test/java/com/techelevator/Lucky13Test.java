package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lucky13Test {

    @Test
    public void TrueOrFalse() {
        Lucky13 test = new Lucky13();

        assertEquals(true, test.getLucky(new int[] {0, 2, 4}));
        assertEquals(true, test.getLucky(new int[] {0, 2, 4}));
        assertEquals(true, test.getLucky(new int[] {0, 2, 4, 0 , 2, 4}));
        assertEquals(false, test.getLucky(new int[] {1, 2, 3}));
        assertEquals(false, test.getLucky(new int[] {1, 2, 4}));
        assertEquals(false, test.getLucky(new int[] {0, 2, 4, 3, 3, 3}));

    }

}
