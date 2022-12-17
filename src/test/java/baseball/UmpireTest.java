package baseball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UmpireTest {

    @ParameterizedTest
    @CsvSource({"713,123,1", "713,145,0", "713,671,0", "713,216,1", "713,713,3"})
    void countStrike(String answer, String input, int expected) {
        Umpire umpire = new Umpire();
        assertEquals(expected, umpire.countStrike(answer, input));
    }

}