package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    @Test
    void createRandomNumber() {
        Game game = new Game();
        String randomNumber = game.createRandomNumber();
        assertEquals(game.getNumSize(), randomNumber.length());
        char[] numChars = randomNumber.toCharArray();
        for (char numChar : numChars) {
            Assertions.assertThat(numChar - '0').isGreaterThan(0).isLessThan(10);
        }
        Set<Character> collect = randomNumber.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
        assertEquals(game.getNumSize(), collect.size());
    }
}