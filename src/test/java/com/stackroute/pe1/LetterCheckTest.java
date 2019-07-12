package com.stackroute.pe1;

import org.junit.Assert;
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

    @Test
    public void givenStringShouldReturnLetterTypeForEachLetter() {
//        act
        String[] actualresult=this.letterCheck.checkword("ap");
//        assert
        String[] expected= {"vowel", "consonant"};
        assertArrayEquals(expected,actualresult);

    }
}
