package com.akanahmet.unit_test;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationTest {

    StringOperation stringOperationTestInstance = new StringOperation();

    @Test
    public void testFindFirstTwoCharacters() {
        String text = "temp";
        String expected = "te";
        String actual = stringOperationTestInstance.findFirstTwoCharacters(text);
        assertEquals(expected,actual);
    }
}
