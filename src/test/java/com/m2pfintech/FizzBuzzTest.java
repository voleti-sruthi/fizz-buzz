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
    void toReturnFIZZBUZZWhenInputIsDivisibleByBothThreeAndFive(){
        String expectedValue = "FIZZBUZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(15);

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

    @Test
    void toReturnFIZZWhenInputContainsThree(){
        String expectedValue = "FIZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(23);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnBUZZWhenInputContainsFive(){
        String expectedValue = "BUZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(56);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnFIZZWhenInputContainsFiveOrDivisibleByThree(){
        String expectedValue = "FIZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(57);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnFIZZWhenInputContainsThreeOrDivisibleByFive(){
        String expectedValue = "FIZZ";

        String actualValue = fizzBuzzObject.checkFizzBuzz(35);

        assertEquals(expectedValue,actualValue);
    }



}
