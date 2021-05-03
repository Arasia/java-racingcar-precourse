package game.racingcar;

import game.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RacingCarGame implements Game {
    private Racing racing;

    @Override
    public void start() {
        initRacing();
        racing.startRacing();
    }

    private void initRacing() {
        while(true) {
            try {
                inputInitData();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("입력값의 타입이 잘못되었습니다.");
            }
        }
    }

    private void inputInitData() throws IllegalArgumentException, InputMismatchException{
        Scanner sc = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = sc.next();
        System.out.println("시도할 회수는 몇회인가요?");
        int totalRound = sc.nextInt();

        racing = new Racing(carNames, totalRound);
        sc.close();
    }
}
