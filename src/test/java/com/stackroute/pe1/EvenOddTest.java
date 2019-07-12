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
        this.evenOdd = new EvenOdd();
    }

    @After
    public void teardown() {
        evenOdd = null;
    }

    @Test
    public void givenAnEvenNumberBetween20to30ShouldReturnTom() {
//        act
        String actualresult = evenOdd.even(24);

//        assert
        assertNotNull(actualresult);
        assertEquals("Jerry", actualresult);

    }

    @Test
    public void givenAOddNumberShouldReturnJerry() {
//        act
        String actualresult = evenOdd.even(25);

//        assert
        assertNotNull(actualresult);
        assertEquals("Tom", actualresult);
    }
}