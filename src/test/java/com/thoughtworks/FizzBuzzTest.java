package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_1() {
        assertEquals("1", new FizzBuzz().calculate(1));
    }

    @Test
    public void should_return_Fizz_when_3() {
        assertEquals("Fizz", new FizzBuzz().calculate(3));
    }

    @Test
    public void should_return_Buzz_when_5() {
        assertEquals("Buzz", new FizzBuzz().calculate(5));
    }

    @Test
    public void should_return_Whizz_when_7() {
        assertEquals("Whizz", new FizzBuzz().calculate(7));
    }

    @Test
    public void should_return_Buzz_when_15() {
        assertEquals("Buzz", new FizzBuzz().calculate(15));
    }

    @Test
    public void should_return_Fizz_when_13() {
        assertEquals("Fizz", new FizzBuzz().calculate(13));
    }

    @Test
    public void should_return_17_when_17() {
        assertEquals("17", new FizzBuzz().calculate(17));
    }

    @Test
    public void should_return_BuzzWhizz_when_35() {
        assertEquals("BuzzWhizz", new FizzBuzz().calculate(35));
    }
    @Test
    public void should_return_Fizz_when_75() {
        assertEquals("Fizz", new FizzBuzz().calculate(75));
    }
}