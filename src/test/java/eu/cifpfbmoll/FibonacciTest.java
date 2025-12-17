package eu.cifpfbmoll;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    void fibonacciOfNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> fibonacci.calculate(-1));
    }



    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 5, 10, 20})
    void fibonacciAlwaysReturnsNonNegativeValue(int n) {
        assertTrue(fibonacci.calculate(n) >= 0);
    }  
}
