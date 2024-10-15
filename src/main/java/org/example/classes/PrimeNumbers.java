package org.example.classes;

import org.example.exceptions.InvalidInputException;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void validatesInputNumber(long targetFibonacciNumber) throws Exception {
        if (targetFibonacciNumber < 2) throw new InvalidInputException("The input for this calculation can not be negative.");
    }

    public static boolean checkIfNumberIsPrime(int numberToCheck) {
        int checkingLimit = (int) Math.sqrt(numberToCheck);

        if (numberToCheck < 2) {
            return false;
        }

        for (int i = 2; i <= checkingLimit; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> solvePrimeNumbers(int limitNumber) throws Exception {
        validatesInputNumber(limitNumber);
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= limitNumber; i++) {
            if (checkIfNumberIsPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }


}
