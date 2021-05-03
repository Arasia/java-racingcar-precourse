package game.racingcar;

public class Fuel {
    private static final int OIL_MIN = 0;
    private static final int OIL_MAX = 9;

    private int oil;

    public Fuel(int oil) {
        validateOilBoundary(oil);
        this.oil = oil;
    }

    private void validateOilBoundary(int oil) {
        if (oil < OIL_MIN || oil > OIL_MAX) {
            throw new IllegalArgumentException("오일의 범위는 0~9 입니다.");
        }
    }

    public int useAllOfOil() {
        int returnedOil = this.oil;
        this.oil = 0;
        return returnedOil;
    }
}
