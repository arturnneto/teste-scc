import org.example.classes.PrimeNumbers;
import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimeNumbersTest {

    private PrimeNumbers primeNumbers;

    @BeforeEach
    void setUp() {
        primeNumbers = new PrimeNumbers();
    }

    @Test
    public void testThatNegativeInputThrowsInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> PrimeNumbers.solvePrimeNumbers(0));
    }

    @Test
    public void testForSpecificNumbers() throws Exception {
        ArrayList<Integer> testArrayList = new ArrayList<>(Arrays.asList(2,3,5,7));
        assertEquals(testArrayList, PrimeNumbers.solvePrimeNumbers(10));
        ArrayList<Integer> testArrayList2 = new ArrayList<>(Arrays.asList(2,3,5));
        assertEquals(testArrayList2, PrimeNumbers.solvePrimeNumbers(6));
        ArrayList<Integer> testArrayList3 = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23));
        assertEquals(testArrayList3, PrimeNumbers.solvePrimeNumbers(24));
    }
}
