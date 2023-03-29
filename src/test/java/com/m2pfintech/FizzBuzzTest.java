package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    FizzBuzz fizzBuzzObject = new FizzBuzz();

    @Test
    void toReturnFIZZWhenInputIsDivisibleByThree(){
        String expectedValue = "FIZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(3);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnBUZZWhenInputIsDivisibleByFive(){
        String expectedValue = "BUZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(5);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnTheNumberWhenInputNumberIsNeitherDivisibleByThreeNorFive(){
        String expectedValue = "17";

        String actualValue = fizzBuzzObject.checkFizzBuzz(17);

        assertEquals(expectedValue,actualValue);
    }
    @Test
    void toThrowIllegalValueExceptionInCaseOfNegativeInputNumbers(){
        assertThrows(IllegalArgumentException.class,()->fizzBuzzObject.checkFizzBuzz(-21));
    }

    @Test
    void toThrowIllegalValueExceptionInCaseOfLargeInputNumbers(){
        assertThrows(IllegalArgumentException.class,()->fizzBuzzObject.checkFizzBuzz(121));
    }




}
