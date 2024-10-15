import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.classes.RecursivePrimeNumbers;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursivePrimeNumbersTest {

    private RecursivePrimeNumbers recursivePrimeNumbers;

    @BeforeEach
    void setUp() {
        recursivePrimeNumbers = new RecursivePrimeNumbers();
    }

    @Test
    public void testThatNegativeInputThrowsInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> RecursivePrimeNumbers.validatesInputNumber(0));
    }

    @Test
    public void testForSpecificNumbers() throws Exception {
        ArrayList<Integer> testArrayList = new ArrayList<>(Arrays.asList(2,3,5,7));
        assertEquals(testArrayList, RecursivePrimeNumbers.solveRecursivePrimeNumbers(10));
        ArrayList<Integer> testArrayList2 = new ArrayList<>(Arrays.asList(2,3,5));
        assertEquals(testArrayList2, RecursivePrimeNumbers.solveRecursivePrimeNumbers(6));
        ArrayList<Integer> testArrayList3 = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23));
        assertEquals(testArrayList3, RecursivePrimeNumbers.solveRecursivePrimeNumbers(24));
    }
}
