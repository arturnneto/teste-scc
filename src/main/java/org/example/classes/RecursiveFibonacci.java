package org.example.classes;

import org.example.exceptions.InvalidInputException;

public class RecursiveFibonacci {

    public static void validatesInputNumber(long targetFibonacciNumber) throws Exception {
        if (targetFibonacciNumber < 0) {
            throw new InvalidInputException("The input for this calculation can not be negative.");
        }
    }

    public static long calculatesFibonacciRecursively(long targetFibonacciNumber) {
        if (targetFibonacciNumber == 0) {
            return 0L;
        }
        if (targetFibonacciNumber == 1) {
            return 1L;
        }

        return calculatesFibonacciRecursively(targetFibonacciNumber - 1) + calculatesFibonacciRecursively(targetFibonacciNumber - 2);
    }

    public static long solveRecursiveFibonacci(long targetFibonacciNumber) throws Exception {
        validatesInputNumber(targetFibonacciNumber);
        return calculatesFibonacciRecursively(targetFibonacciNumber);
    }
}
