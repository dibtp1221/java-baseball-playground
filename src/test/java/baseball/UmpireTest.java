package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UmpireTest {

    @Test
    void count_strike() {
        Umpire umpire = new Umpire();
        Assertions.assertEquals(3, umpire.countStrike(Arrays.asList(1,2,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals(2, umpire.countStrike(Arrays.asList(1,4,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals(1, umpire.countStrike(Arrays.asList(9,4,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals(0, umpire.countStrike(Arrays.asList(9,4,2), Arrays.asList(1,2,3)));
    }

    @Test
    void count_ball() {
        Umpire umpire = new Umpire();
        Assertions.assertEquals(0, umpire.countBall(Arrays.asList(1,2,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals(0, umpire.countBall(Arrays.asList(1,4,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals(1, umpire.countBall(Arrays.asList(2,4,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals(2, umpire.countBall(Arrays.asList(3,4,2), Arrays.asList(1,2,3)));
        Assertions.assertEquals(3, umpire.countBall(Arrays.asList(3,1,2), Arrays.asList(1,2,3)));
    }

    @Test
    void call_counts() {
        Umpire umpire = new Umpire();
        Assertions.assertEquals("1볼 1스트라이크", umpire.callCounts(Arrays.asList(2,4,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals("2스트라이크", umpire.callCounts(Arrays.asList(1,4,3), Arrays.asList(1,2,3)));
        Assertions.assertEquals("1볼", umpire.callCounts(Arrays.asList(9,4,2), Arrays.asList(1,2,3)));
        Assertions.assertEquals("낫싱", umpire.callCounts(Arrays.asList(1,2,3), Arrays.asList(4,5,6)));
    }
}
