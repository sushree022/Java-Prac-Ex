package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern pattern;

    @Before
    public void setUp() {
        this.pattern = new Pattern();
    }
    @After
    public void tearDown()
    {
        pattern = null;
    }

    @Test
    public void givenNumberShouldReturnArray() {
        //act
        int[] actualResult = this.pattern.numpattern(5);
        //assert
        int[] expectedResult = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnArrayOfLengthOne() {
        //act
        int[] actualResult = this.pattern.numpattern(1);
        //assert
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnAnEmptyArray() {
        //act
        int[] actualResult = this.pattern.numpattern(0);
        //assert
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, actualResult);
    }



}