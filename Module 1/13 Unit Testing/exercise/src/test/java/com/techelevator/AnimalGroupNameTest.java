package com.techelevator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalGroupNameTest {

    @Test
    public void ReturnSuccess() {
        //Arrange
        AnimalGroupName name = new AnimalGroupName();

        //Assert
        assertEquals("Pack", name.getHerd("dog"));
        assertEquals("Pack", name.getHerd("dOg"));
        assertEquals("unknown", name.getHerd(""));
        assertEquals("Murder", name.getHerd("Crow"));
        assertEquals("unknown", name.getHerd("walrus"));
        assertEquals("unknown", name.getHerd(null));
    }
}
