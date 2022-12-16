package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        System.out.println(calculate(expression));
    }
    
    public static int calculate(String expression) {
        String[] values = expression.split(" ");
        int result = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; i+=2) {
            int num = Integer.parseInt(values[i+1]);
            result = calculate(result, num, values[i]);
        }
        return result;
    }

    private static int calculate(int a, int b, String operator) {
        if ("+".equals(operator)) {
            return a + b;
        }
        if ("-".equals(operator)) {
            return a - b;
        }
        if ("*".equals(operator)) {
            return a * b;
        }
        return a / b;
    }
}
