package com.m2pfintech;

public class FizzBuzz {
    private boolean checkValidity(int inputNumber) {
        return inputNumber > 0 && inputNumber <= 100;
    }

    public String checkFizzBuzz(int inputNumber) {
        if (checkValidity(inputNumber)) {
            if (inputNumber % 3 == 0) {
                return "FIZZ";
            } else if (inputNumber % 5 == 0) {
                return "BUZZ";
            }
            return String.valueOf(inputNumber);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
