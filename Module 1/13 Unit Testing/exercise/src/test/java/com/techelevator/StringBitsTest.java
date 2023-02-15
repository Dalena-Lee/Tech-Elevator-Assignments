package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBitsTest {

    @Test
    public void HappyPath2(){
        //Arrange (Make an object)
        StringBits bits = new StringBits();

        //Assert
        assertEquals("Hlo", bits.getBits("Hello"));
        assertEquals("Hello", bits.getBits("Heeololeo"));
        assertEquals("H", bits.getBits("Hi"));

    }
}
