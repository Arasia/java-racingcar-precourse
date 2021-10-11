package racinggame.racing;

public class Racing {
    private final Cars cars;
    private final int totalRound;

    public Racing(Cars cars, int totalRound) {
        this.cars = cars;
        this.totalRound = totalRound;
    }

    public void startRacing() {
        int round = 0;

        while (round++ != totalRound) {
            startRound();
        }

        printWinner();
    }

    private void startRound() {
        cars.tryToMoveAllCar();

        System.out.println(cars.getPositionStringAllCar());
    }

    private void printWinner() {
        System.out.println("최종 우승자는 " + cars.getFastestCarsName() + " 입니다.");
    }
}
