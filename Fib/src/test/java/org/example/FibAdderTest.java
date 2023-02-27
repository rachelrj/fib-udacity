package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibAdderTest  {

    @Test
    public void testNineteenth() {
        assertEquals(4181, FibAdder.getSumOfFibSequence(19));
    }

}
