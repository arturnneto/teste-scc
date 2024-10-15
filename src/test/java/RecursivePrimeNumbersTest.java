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
        ArrayList<Integer> testResultingArrayList = new ArrayList<>();
        assertEquals(testArrayList, RecursivePrimeNumbers.solveRecursivePrimeNumbers(testResultingArrayList, 10, 0));
        ArrayList<Integer> testArrayList2 = new ArrayList<>(Arrays.asList(2,3,5));
        ArrayList<Integer> testResultingArrayList2 = new ArrayList<>();
        assertEquals(testArrayList2, RecursivePrimeNumbers.solveRecursivePrimeNumbers(testResultingArrayList2, 6, 0));
        ArrayList<Integer> testArrayList3 = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23));
        ArrayList<Integer> testResultingArrayList3 = new ArrayList<>();
        assertEquals(testArrayList3, RecursivePrimeNumbers.solveRecursivePrimeNumbers(testResultingArrayList3, 24, 0));
    }
}
