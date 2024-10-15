package org.example.classes;

import org.example.exceptions.InvalidInputException;

public class Fibonacci {

    private static final long firstFibonacciNumber = 0L;
    private static final long secondFibonacciNumber = 1L;

    public static void validatesInputNumber(long targetFibonacciNumber) throws Exception {
        if (targetFibonacciNumber < 0) throw new InvalidInputException("The input for this calculation can not be negative.");
    }

    public static long calculatesFibonacci(long targetFibonacciNumber) {
        long firstNumberInSequence = firstFibonacciNumber;
        long secondNumberInSequence = secondFibonacciNumber;
        long correspondingNumber = 0;

        if (targetFibonacciNumber == 0) {
            return firstNumberInSequence;
        }
        if (targetFibonacciNumber == 1) {
            return secondNumberInSequence;
        }

        for (int i = 2; i <= targetFibonacciNumber; i++) {
            correspondingNumber = firstNumberInSequence + secondNumberInSequence;
            firstNumberInSequence = secondNumberInSequence;
            secondNumberInSequence = correspondingNumber;
        }

        return  correspondingNumber;
    }

    public static long solveFibonacci(long targetNumber) throws Exception {
        validatesInputNumber(targetNumber);
        return calculatesFibonacci(targetNumber);
    }
}
