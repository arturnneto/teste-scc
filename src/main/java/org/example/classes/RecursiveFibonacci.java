package org.example.classes;

import org.example.exceptions.InvalidInputException;

public class RecursiveFibonacci {
    public static long solveFibonacci(long targetFibonacciNumber) {
        if (targetFibonacciNumber < 0) {
            throw new InvalidInputException("The input for this calculation can not be negative.");
        }

        if (targetFibonacciNumber == 0) {
            return 0L;
        }
        if (targetFibonacciNumber == 1) {
            return 1L;
        }

        return solveFibonacci(targetFibonacciNumber - 1) + solveFibonacci(targetFibonacciNumber - 2);
    }
}
