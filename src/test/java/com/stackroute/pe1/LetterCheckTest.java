package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LetterCheckTest {
    LetterCheck letterCheck;

    @Before
    public void setup()
    {
//        arrange
        this.letterCheck= new LetterCheck();
    }
    @After
    public void teardown()
    {
        letterCheck= null;
    }

    @Test
    public void givenStringShouldReturnLetterTypeForEachLetter() {
//        act
        String[] actualresult=this.letterCheck.checkword("ap");
//        assert
        String[] expected= {"vowel", "consonant"};
        assertArrayEquals(expected,actualresult);

    }
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException()
    {
        this.letterCheck.checkword(null);
    }
}
