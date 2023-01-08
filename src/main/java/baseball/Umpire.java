package baseball;

import java.util.List;

public class Umpire {
    public int countStrike(List<Integer> answer, List<Integer> input) {
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

    public int countBall(List<Integer> answer, List<Integer> input) {
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
}
