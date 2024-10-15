package org.example.classes;

import org.example.exceptions.InvalidInputException;

public class Fibonacci {
    public static int solveFibonacci(int targetNumber) throws Exception {
        int correspondingNumberInFibonacciSequence = 0;

        if (targetNumber < 0) {
            throw new InvalidInputException("The input for calculating the Fibonacci sequence can not be negative.");
        }

        return correspondingNumberInFibonacciSequence;
    }
}
