package game;

public class GameRunner {
    private GameRunner() {
        throw new IllegalStateException("Runner Class");
    }

    public static void start(Game game) {
        game.start();
    }
}
