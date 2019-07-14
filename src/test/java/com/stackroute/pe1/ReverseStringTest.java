package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString;

    @Before
    public void setup()
    {
//        arrange
        reverseString= new ReverseString();
    }

    @After
    public void teardown()
    {
        reverseString= null;
    }

    @Test
    public void givenStringShouldReturnReverseString() {
//        act
        String actualresult = this.reverseString.stringreverse("sushree");
//        assert

        assertEquals("eerhsus", actualresult);
    }
    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()
    {
        this.reverseString.stringreverse(null);
    }
}