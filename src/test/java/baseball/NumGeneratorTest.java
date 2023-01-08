package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class NumGeneratorTest {

    @Test
    void generate_random_num() {
        NumGenerator numGenerator = new NumGenerator();
        List<Integer> randomNums = numGenerator.generateRandomNums();

        Assertions.assertThat(randomNums.size()).isEqualTo(NumGenerator.NUM_LENGTH);

        HashSet<Integer> integerSet = new HashSet<>(randomNums);
        Assertions.assertThat(randomNums.size()).isEqualTo(integerSet.size());

        for (Integer randomNum : randomNums) {
            Assertions.assertThat(randomNum).isLessThan(10).isGreaterThan(0);
        }
    }
}
