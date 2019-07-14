package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {
    Pallindrome pallindrome;

    @Before
    public void setup()
    {
//      arrange
        pallindrome= new Pallindrome();
    }
    @After
    public void teardown()
    {
        pallindrome= null;
    }

    @Test
    public void givenPallindromeNumberShouldReturnString()
    {
//        act
        String actualresul= pallindrome.pallindromenumber(12321);
//        assert
        assertEquals("pallindrome", actualresul);

    }
    @Test
    public void givenNotPallindromeNumberShouldReturnString()
    {
//        act
        String actualresul= pallindrome.pallindromenumber(56479);
//        assert
        assertEquals("not pallindrome", actualresul);

    }

}