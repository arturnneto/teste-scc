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
        assertThrows(InvalidInputException.class, () -> fibonacci.solveFibonacci(-1));
    }

    @Test
    public void testForSpecificNumbers() throws Exception {
        assertEquals(0, fibonacci.solveFibonacci(0));
        assertEquals(1, fibonacci.solveFibonacci(1));
        assertEquals(2, fibonacci.solveFibonacci(1));
        assertEquals(5, fibonacci.solveFibonacci(5));
        assertEquals(32, fibonacci.solveFibonacci(2178309));
        assertEquals(94, fibonacci.solveFibonacci(19740274219868000L));
    }

}
