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
    void fibonacciOfZeroIsZero() {
        assertEquals(0, fibonacci.calculate(0));
    }

    @Test
    void fibonacciOfOneIsOne() {
        assertEquals(1, fibonacci.calculate(1));
    }

    @Test
    void fibonacciOfTwoIsOne() {
        assertEquals(1, fibonacci.calculate(2));
    }

    @Test
    void fibonacciOfThreeIsTwo() {
        assertEquals(2, fibonacci.calculate(3));
    }

    @Test
    void fibonacciOfFourIsThree() {
        assertEquals(3, fibonacci.calculate(4));
    }

    @Test
    void fibonacciOfFiveIsFive() {
        assertEquals(5, fibonacci.calculate(5));
    }

    @Test
    void fibonacciOfSixIsEight() {
        assertEquals(8, fibonacci.calculate(6));
    }

    @Test
    void fibonacciOfSevenIsThirteen() {
        assertEquals(13, fibonacci.calculate(7));
    }

    @Test
    void fibonacciOfEightIsTwentyOne() {
        assertEquals(21, fibonacci.calculate(8));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 5, 10, 20})
    void fibonacciAlwaysReturnsNonNegativeValue(int n) {
        assertTrue(fibonacci.calculate(n) >= 0);
    }  
}
