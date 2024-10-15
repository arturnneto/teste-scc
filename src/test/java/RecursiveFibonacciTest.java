import org.example.classes.Fibonacci;
import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursiveFibonacciTest {

    private RecursiveFibonacci recursiveFibonacci;

    @BeforeEach
    void setUp() {
        recursiveFibonacci = new RecursiveFibonacci();
    }

    @Test
    public void testThatNegativeInputThrowsInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> RecursiveFibonacci.solveFibonacci(-1));
    }
}
