package baseball;

import java.util.Set;
import java.util.stream.Collectors;

public class Umpire {

    public int countStrike(String answer, String input) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            strike += Boolean.compare(answer.charAt(i) == input.charAt(i), false);
        }
        return strike;
    }

    public int countBall(String answer, String input) {
        Set<Character> answerSet = answer.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
        Set<Character> inputSet = input.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

        answerSet.retainAll(inputSet);
        return answerSet.size() - countStrike(answer, input);
    }

}
