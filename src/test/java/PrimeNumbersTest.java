import org.example.classes.RecursiveFibonacci;
import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimeNumbersTest {

    private PrimeNumbers primeNumbers;

    @BeforeEach
    void setUp() {
        primeNumbers = new PrimeNumbers();
    }

    @Test
    public void testThatNegativeInputThrowsInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> PrimeNumbers.solvePrimeNumbers(-1));
    }
}
