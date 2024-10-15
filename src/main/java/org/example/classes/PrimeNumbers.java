package org.example.classes;

import org.example.exceptions.InvalidInputException;

import java.util.ArrayList;

public class PrimeNumbers {

    public static ArrayList<Integer> solvePrimeNumbers(int number) throws Exception{
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        if (number < 0) {
            throw new InvalidInputException("The input for this calculation can not be negative.");
        }

        return primeNumbers;
    }
}
