package org.example.classes;

import org.example.exceptions.InvalidInputException;

public class Fibonacci {
    public long solveFibonacci(long targetNumber) throws Exception {
        if (targetNumber < 0) {
            throw new InvalidInputException("The input for this calculation can not be negative.");
        }

        long firstNumber = 0;
        long secondNumber = 1;
        long correspondingNumber = 0;

        for (int i = 2; i <= targetNumber; i++) {
            correspondingNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = correspondingNumber;
        }

        return correspondingNumber;
    }
}
