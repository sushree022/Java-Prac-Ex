package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sorting;

    @Before
    public void setup()
    {
//        arrange
        sorting= new Sorting();
    }
    @After
    public void teardown()
    {
        sorting= null;
    }

    @Test
    public void givenNumberShouldReturnNumberWithDigitsInIncreasingOrder()
    {
//        act
        int actualresult= sorting.digitsorting(829);
//        assert
        assertEquals(289,actualresult);
    }
}