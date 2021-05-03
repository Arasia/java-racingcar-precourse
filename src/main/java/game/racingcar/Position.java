package game.racingcar;

public class Position {
    private int currentPosition;

    public Position() {
        currentPosition = 0;
    }

    public void positionPlusOne() {
        currentPosition++;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
