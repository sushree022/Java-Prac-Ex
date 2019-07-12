package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterCheckTest {
    CharacterCheck charactercheck;
    @Before
    public void setup()
    {
//        arrange
        this.charactercheck= new CharacterCheck();
    }
    @After
    public void teardown()
    {
        charactercheck = null;
    }

    @Test
    public void givenCharacterShouldReturnLowerCase() {
        //act
        String actualResult = this.charactercheck.check('m');
        //assert
        assertEquals("The entered character is lowercase", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnUpperCase() {
        //act
        String actualResult = this.charactercheck.check('P');
        //assert
        assertEquals("The entered character is uppercase", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnDigit() {
        //act
        String actualResult = this.charactercheck.check('7');
        //assert
        assertEquals("The entered character is a digit", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnSpecialSymbol() {
        //act
        String actualResult = this.charactercheck.check('#');
        //assert
        assertEquals("The entered character is a special character", actualResult);
    }
}