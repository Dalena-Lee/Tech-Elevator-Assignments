package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontTimesTest {

    @Test
    public void StringTest() {
        //Arrange
        FrontTimes test = new FrontTimes();

        //Assert
        assertEquals("ChoChoCho", test.generateString("Chocolate", 3));
        assertEquals("ChoCho", test.generateString("Chocolate", 2));
        assertEquals("AbcAbcAbc", test.generateString("Abc", 3));
        assertEquals("123123123", test.generateString("123", 3));
        assertEquals("   ", test.generateString(" ", 3));
    }
}
