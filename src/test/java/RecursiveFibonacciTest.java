import org.example.classes.Fibonacci;
import org.example.classes.RecursiveFibonacci;
import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursiveFibonacciTest {

    private RecursiveFibonacci recursiveFibonacci;

    @BeforeEach
    void setUp() {
        recursiveFibonacci = new RecursiveFibonacci();
    }

    @Test
    public void testThatNegativeInputThrowsInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> RecursiveFibonacci.solveRecursiveFibonacci(-1));
    }

    @Test
    public void testForSpecificNumbers() throws Exception {
        assertEquals(0, RecursiveFibonacci.solveRecursiveFibonacci(0));
        assertEquals(1, RecursiveFibonacci.solveRecursiveFibonacci(1));
        assertEquals(1, RecursiveFibonacci.solveRecursiveFibonacci(2));
        assertEquals(5, RecursiveFibonacci.solveRecursiveFibonacci(5));
        assertEquals(610, RecursiveFibonacci.solveRecursiveFibonacci(15));
        assertEquals(317811, RecursiveFibonacci.solveRecursiveFibonacci(28));
    }
}
