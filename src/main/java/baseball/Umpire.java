package baseball;

public class Umpire {

    public int countStrike(String answer, String input) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            strike += Boolean.compare(answer.charAt(i) == input.charAt(i), false);
        }
        return strike;
    }

}
