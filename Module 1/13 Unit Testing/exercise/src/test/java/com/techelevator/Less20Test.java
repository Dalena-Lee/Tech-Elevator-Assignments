package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Less20Test {

    @Test
    public void TrueOrFalse(){
        Less20 test = new Less20();

        assertEquals(true, test.isLessThanMultipleOf20(18));
        assertEquals(true, test.isLessThanMultipleOf20(19));
        assertEquals(false, test.isLessThanMultipleOf20(20));
        assertEquals(true, test.isLessThanMultipleOf20(38));
        assertEquals(true, test.isLessThanMultipleOf20(39));
        assertEquals(false, test.isLessThanMultipleOf20(40));
        assertEquals(true, test.isLessThanMultipleOf20(998));
        assertEquals(true, test.isLessThanMultipleOf20(999));
        assertEquals(false, test.isLessThanMultipleOf20(1000));
    }
}
