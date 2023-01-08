package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputGetter {
    public static final int NUM_LENGTH = 3;

    private final Scanner scanner = new Scanner(System.in);

    public List<Integer> getInput() {
        while (true) {
            System.out.print("숫자를 입력해 주세요 : ");
            String input = scanner.nextLine();
            try {
                return parseInput(input);
            } catch(Exception ignored) {
            }
        }
    }

    protected List<Integer> parseInput(String input) {

        ArrayList<Integer> result = new ArrayList<>(NUM_LENGTH);

        if (input.length() != NUM_LENGTH)
            throw new NumberFormatException("입력값 길이 invalid");
        String[] splitted = input.split("");
        for (String s1 : splitted) {
            result.add(Integer.parseInt(s1));
        }

        return result;
    }
}
