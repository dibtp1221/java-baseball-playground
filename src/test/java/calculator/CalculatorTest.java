package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"2 + 3,5", "2 + 3 * 4 / 2,10", "10 * 3 + 2,32","2 + 3 * 2 / 2 + 10 / 5,3" })
    void calculate(String expression, int expected) {
        assertEquals(expected, Calculator.calculate(expression));
    }
}