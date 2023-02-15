package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateFashionTest {

    @Test
    public void CorrectNumTest() {
        //Arrange
        DateFashion test = new DateFashion();

        //Assert
        assertEquals(2, test.getATable(8, 3));
        assertEquals(2, test.getATable(3, 8));

        assertEquals(1, test.getATable(7,7));
        assertEquals(1, test.getATable(3, 3));
        assertEquals(1, test.getATable(5, 5));
        assertEquals(1, test.getATable(7, 3));
        assertEquals(1, test.getATable(3, 7));

        assertEquals(0, test.getATable(5, 2));
        assertEquals(0, test.getATable(2, 5));
        assertEquals(0, test.getATable(2, 10));
        assertEquals(0, test.getATable(10, 2));
        assertEquals(0, test.getATable(8, 2));
        assertEquals(0, test.getATable(2, 8));
        assertEquals(0, test.getATable(8, 2));
        assertEquals(0, test.getATable(0, 10));
        assertEquals(0, test.getATable(10, 0));
    }
}
