import org.example.classes.Fibonacci;
import org.example.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testThatNegativeInputThrowsInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> Fibonacci.solveFibonacci(-1));
    }

    @Test
    public void testForSpecificNumbers() throws Exception {
        assertEquals(0, Fibonacci.solveFibonacci(0));
        assertEquals(1, Fibonacci.solveFibonacci(1));
        assertEquals(1, Fibonacci.solveFibonacci(2));
        assertEquals(5, Fibonacci.solveFibonacci(5));
        assertEquals(2178309, Fibonacci.solveFibonacci(32));
        assertEquals(7540113804746346429L, Fibonacci.solveFibonacci(92));
    }
}
