package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {
    @Test
    public void GetPartialStringTest() {
        NonStart test = new NonStart();

        assertEquals("ellohere", test.getPartialString("Hello", "There"));
        assertEquals("avaode", test.getPartialString("java", "code"));
        assertEquals("hotlava", test.getPartialString("shotl", "java"));
        assertEquals("ava", test.getPartialString(null, "java"));
        assertEquals("ava", test.getPartialString("java", null));
        assertEquals("ava", test.getPartialString("", "java"));
        assertEquals("ava", test.getPartialString("java", ""));
        assertEquals("2356", test.getPartialString("123", "456"));
        assertEquals("", test.getPartialString("", "a"));
        assertEquals("", test.getPartialString("a", ""));
        assertEquals("1, -2, -356", test.getPartialString("-1, -2, -3", "456"));

    }

}
