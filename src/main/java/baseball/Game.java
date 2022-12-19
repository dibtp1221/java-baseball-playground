package baseball;

import java.util.*;

public class Game {
    private final int numSize;
    private final Umpire umpire;

    public Game() {
        numSize = 3;
        umpire = new Umpire();
    }

    public int getNumSize() {
        return numSize;
    }

    protected HashMap<BallType, Integer> score(String answer, String input) {
        HashMap<BallType, Integer> result = new HashMap<>();
        result.put(BallType.BALL, umpire.countBall(answer, input));
        result.put(BallType.STRIKE, umpire.countStrike(answer, input));
        return result;
    }

    protected String makeResultMsg(int ballCount, int strikeCount) {
        String resultMsg = "";
        if (ballCount == 0 && strikeCount == 0) {
            return "낫싱";
        }
        if (ballCount > 0) {
            resultMsg += ballCount + "볼";
        }
        if (ballCount > 0 && strikeCount > 0) {
            resultMsg += " ";
        }
        if (strikeCount > 0) {
            resultMsg += strikeCount + "스트라이크";
        }
        return resultMsg;
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
