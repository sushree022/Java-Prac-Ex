package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    RepeatString repeatString;

    @Before
    public void setup()
    {
//        arrange
        repeatString= new RepeatString();
    }
    @After
    public void teardown()
    {
        repeatString= null;
    }

    @Test
    public void givenStringShouldReturnStringPlusTrimString()
    {
//        act
     String actualresult= this.repeatString.trimstring("sushree",3);

//        assert
        assertEquals("sushreereereeree", actualresult);
    }

    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException()
    {

        this.repeatString.trimstring(null,0);
    }
}