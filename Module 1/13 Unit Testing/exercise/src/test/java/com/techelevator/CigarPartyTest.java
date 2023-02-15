package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CigarPartyTest {

    @Test
    public void TestTrueOrFalse() {
        //Arrange
        CigarParty test = new CigarParty();

        //Assert
        assertEquals(false, test.haveParty(30, false));
        assertEquals(true, test.haveParty(50, false));
        assertEquals(true, test.haveParty(70, true));
        assertEquals(true, test.haveParty(999999, true));
        assertEquals(false, test.haveParty(-1, true));
        assertEquals("Squirrels cannot have a party with 0 cigars.",false, test.haveParty(0, true));
    }
}
