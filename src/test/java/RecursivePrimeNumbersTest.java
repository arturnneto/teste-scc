import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.classes.RecursivePrimeNumbers;

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
}
