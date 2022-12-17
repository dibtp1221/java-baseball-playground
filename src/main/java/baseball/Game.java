package baseball;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private final int numSize;

    public Game() {
        numSize = 3;
    }

    public int getNumSize() {
        return numSize;
    }

    protected String createRandomNumber() {
        StringBuilder answer = new StringBuilder();
        List<String> numbers = new LinkedList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        for (int i = 0; i < numSize; i++) {
            answer.append(numbers.remove((int) (Math.random() * numbers.size())));
        }
        return answer.toString();
    }

}
