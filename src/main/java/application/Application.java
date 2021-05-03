package application;

import game.GameRunner;
import game.racingcar.RacingCarGame;

public class Application {
    public static void main(String[] args) {
        GameRunner.start(new RacingCarGame());
    }
}
