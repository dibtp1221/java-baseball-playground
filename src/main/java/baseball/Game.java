package baseball;

import java.util.List;
import java.util.Scanner;

public class Game {

    private final InputGetter inputGetter = new InputGetter();
    private final NumGenerator numGenerator = new NumGenerator();
    private final Umpire umpire = new Umpire();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();
        game.game();
    }

    public void game() {
        boolean flag = true;
        while (flag) {
            play();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int i = scanner.nextInt();
            flag = i == 1;
        }
    }

    private void play() {
        List<Integer> answer = numGenerator.generateRandomNums();
        boolean flag = true;
        while(flag) {
            List<Integer> input = inputGetter.getInput();
            String count = umpire.callCounts(answer, input);
            System.out.println(count);
            flag = count.equals("3스트라이크");
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
