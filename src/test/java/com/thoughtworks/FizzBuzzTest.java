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
}