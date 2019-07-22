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
    public void givenEvenNumberBetween20to30ShouldReturnAString() {
//        act
        String actualresult = evenOdd.even(24);

//        assert
        assertEquals("Jerry", actualresult);

    }

    @Test
    public void givenOddNumberBetween20To30ShouldReturnAString() {
//        act
        String actualresult = evenOdd.even(25);

//        assert
        assertEquals("Tom", actualresult);
    }
    @Test
    public void givenNumberMoreThan30OrLessThan20ShouldReturnAStringMessage() {
//        act
        String actualresult = evenOdd.even(50);

//        assert
        assertEquals("Enter number between 20 and 30", actualresult);
    }

}