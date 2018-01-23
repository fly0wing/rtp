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
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.process(3);
        assertEquals("Fizz", result);
    }
}