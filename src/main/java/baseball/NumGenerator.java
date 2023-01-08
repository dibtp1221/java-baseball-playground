package baseball;

import java.util.ArrayList;
import java.util.List;

public class NumGenerator {

    public static final int NUM_LENGTH = 3;

    public List<Integer> generateRandomNums() {
        ArrayList<Integer> result = new ArrayList<>(NUM_LENGTH);
        while (result.size() < NUM_LENGTH) {
            generateRandomNum(result);
        }
        return result;
    }

    private void generateRandomNum(ArrayList<Integer> result) {
        int rand = (int)(Math.random() * 9) + 1;
        if (result.contains(rand))
            return;
        result.add(rand);
    }
}
