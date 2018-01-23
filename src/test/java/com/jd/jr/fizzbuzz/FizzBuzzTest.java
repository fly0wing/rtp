package com.jd.jr.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class FizzBuzzTest {

    @Test
    public void given_3_return_Fizz() throws Exception {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.process(3);

        // then
        assertEquals("Fizz", result);
    }

    @Test
    public void given_5_return_Buzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.process(5);

        assertEquals("Buzz", result);
    }

    @Test
    public void given_6_return_Fizz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.process(6);

        assertEquals("Fizz", result);
    }

    @Test
    public void given_10_return_Buzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.process(10);

        assertEquals("Buzz", result);
    }
}