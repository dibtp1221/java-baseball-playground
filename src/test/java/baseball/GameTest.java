package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"낫싱,0,0", "1볼 1스트라이크,1,1", "2스트라이크,0,2", "2볼,2,0"})
    void makeResultMsg(String expected, int ballCount, int strikeCount) {
        Game game = new Game();
        assertEquals(expected, game.makeResultMsg(ballCount, strikeCount));
    }
}