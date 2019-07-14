package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitdemoTest {
    Junitdemo junitdemo;

    @Before
    public void setup() {
        //        arrange
        System.out.println("Inside before");
        this.junitdemo = new Junitdemo();
    }

    @After
    public void teardown() {
        System.out.println("Inside After");
        junitdemo = null;
    }

    @BeforeClass
    public static void beforeclass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterclass() {
        System.out.println("After class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperString() {

//        act
        String actualresult = junitdemo.concatAndUpperCase("Hello", "Sushree");

//        assert
        assertNotNull(actualresult);
        assertEquals("HELLOSUSHREE", actualresult);

    }

    @Test
    public void givenAStringAndANullShouldReturnErrorMessage() {
//        act
        String actualresult = junitdemo.concatAndUpperCase("Hello", null);

//        assert
        assertNotNull(actualresult);
        assertEquals("Null Values not allowed", actualresult);

    }
    @Test

    public void givenAStringShouldReturnReverse() {
//        act
        String actualresult = junitdemo.reverseString("Hello");

//        assert
        assertEquals("olleH", actualresult);
    }

    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()
    {
        this.junitdemo.reverseString(null);
    }
}

