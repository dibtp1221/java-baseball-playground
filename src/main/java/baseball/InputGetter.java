package baseball;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

public class InputGetter {
    public static final int NUM_LENGTH = 3;
    public List<Integer> getInput(String s) {

        ArrayList<Integer> result = new ArrayList<>(NUM_LENGTH);

        if (s.length() > NUM_LENGTH)
            throw new NumberFormatException("입력값 길이 3 초과");
        String[] splitted = s.split("");
        for (String s1 : splitted) {
            result.add(Integer.parseInt(s1));
        }

        return result;
    }
}
