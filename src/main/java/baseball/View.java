package baseball;

import java.util.HashMap;
import java.util.Scanner;

public class View {

    private final Game game = new Game();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        View gameView = new View();
        gameView.game();
    }

    private void game() {
        boolean over = false;
        while (!over) {
            over = play();
        }
    }

    private boolean play() {
        String answer = game.createRandomNumber();
        boolean correct = false;
        while (!correct) {
            correct = input(answer);
        }
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return "2".equals(scanner.nextLine());
    }

    private boolean input(String answer) {
        System.out.print("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        HashMap<BallType, Integer> score = game.score(answer, input);

        System.out.println(game.makeResultMsg(score.get(BallType.BALL), score.get(BallType.STRIKE)));

        if (score.get(BallType.STRIKE) == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }

        return false;
    }

}
