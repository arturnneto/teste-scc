package org.example.classes;

import org.example.exceptions.InvalidInputException;

import java.util.ArrayList;

public class RecursivePrimeNumbers {

    public static void validatesInputNumber(long targetFibonacciNumber) throws Exception {
        if (targetFibonacciNumber < 2) throw new InvalidInputException("The input for this calculation can not be negative.");
    }


}
