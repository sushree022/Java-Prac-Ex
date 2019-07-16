package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setup()
    {
//      arrange
        palindrome= new Palindrome();
    }
    @After
    public void teardown()
    {
        palindrome= null;
    }

    @Test
    public void givenPallindromeNumberShouldReturnString()
    {
//        act
        String actualresul= palindrome.palindromenumber(12321);
//        assert
        assertEquals("palindrome", actualresul);

    }
    @Test
    public void givenNotPallindromeNumberShouldReturnString()
    {
//        act
        String actualresul= palindrome.palindromenumber(56479);
//        assert
        assertEquals("not palindrome", actualresul);

    }

}