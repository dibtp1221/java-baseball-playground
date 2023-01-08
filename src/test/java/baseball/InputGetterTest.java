package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InputGetterTest {
    @Test
    void getInput() {
        InputGetter inputGetter = new InputGetter();
        Assertions.assertEquals(Arrays.asList(1, 2, 3), inputGetter.getInput("123"));
        Assertions.assertThrows(NumberFormatException.class, () -> inputGetter.getInput("1034"));
        Assertions.assertThrows(NumberFormatException.class, () -> inputGetter.getInput("ds3"));
    }
}
