package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfnNosTest {
    SumOfnNos sumOfnNos;

    @Before
    public void setup()
    {
//        arrange
        sumOfnNos=new SumOfnNos();
    }
    @After
    public void teardown()
    {
        sumOfnNos= null;
    }

    @Test
    public void givenArrayOfNumbersShouldReturnSummation()
    {
//   act
        int numbers[]={12,3,4};
        int actualresult= sumOfnNos.summation(numbers);
//        assert
        assertEquals(19,actualresult);
    }
}