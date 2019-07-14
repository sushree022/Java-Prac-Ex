package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd evenOdd;
    @Before
    public void setup() {
        //        arrange
        evenOdd = new EvenOdd();
    }

    @After
    public void teardown()
    {
        evenOdd = null;
    }

    @Test
    public void givenEvenNumberBetween20to30ShouldReturnString() {
//        act
        String actualresult = evenOdd.even(24);

//        assert
        assertEquals("Jerry", actualresult);

    }

    @Test
    public void givenOddNumberShouldReturnStrings() {
//        act
        String actualresult = evenOdd.even(25);

//        assert
        assertEquals("Tom", actualresult);
    }

}