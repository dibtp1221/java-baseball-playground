package baseball;

import java.util.List;

public class Umpire {
    protected int countStrike(List<Integer> answer, List<Integer> input) {
        int count = 0;
        for (int i=0; i<answer.size(); i++) {
            count += isSame(answer.get(i), input.get(i));
        }
        return count;
    }

    private int isSame(int a, int b) {
        if (a == b) return 1;
        else return 0;
    }

    protected int countBall(List<Integer> answer, List<Integer> input) {
        return countSameNumbers(answer, input) - countStrike(answer, input);
    }

    private int countSameNumbers(List<Integer> answer, List<Integer> input) {
        int count = 0;
        for (Integer integer : answer) {
            count += contains(input, integer);
        }
        return count;
    }

    private int contains(List<Integer> input, int num) {
        if (input.contains(num)) return 1;
        else return 0;
    }

    public String callCounts(List<Integer> answer, List<Integer> input) {
        int ball = countBall(answer, input);
        int strike = countStrike(answer, input);
        if (ball == 0 && strike == 0) {
            return "낫싱";
        }
        String call = "";
        if (ball != 0) {
            call += ball + "볼";
        }
        if (ball != 0 && strike != 0) {
            call += " ";
        }
        if (strike != 0) {
            call += strike + "스트라이크";
        }
        return call;
    }
}
