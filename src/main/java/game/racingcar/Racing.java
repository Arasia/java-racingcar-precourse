package game.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {
    private final Cars cars;
    private final TotalRound totalRound;

    private final Random random = new Random();

    public Racing(String carNames, int totalRound) {
        List<Car> carsTemp = new ArrayList<>();
        for (String name : carNames.split(",")) {
            carsTemp.add(new Car(name));
        }

        this.cars = new Cars(carsTemp);
        this.totalRound = new TotalRound(totalRound);
    }

    public void startRacing() {
        for (int i = 1; i <= totalRound.getRound(); i++) {
            nextRound();
        }

        System.out.println(getWinner() + "가 최종 우승했습니다.");
    }

    public String getWinner() {
        cars.reversSortCars();
        int winnerPosition = cars.getCar(0).getPosition();

        return String.join(",", cars.getNameListOfSamePosition(winnerPosition));
    }

    public void nextRound() {
        StringBuilder roundResult = new StringBuilder();

        for (int i = 0; i < cars.getCountOfCars(); i++) {
            roundResult.append(
                    cars.getCar(i)
                            .setFuel(new Fuel(random.nextInt(10)))
                            .move()
                            .getRaceState())
                    .append("\n");
        }

        System.out.println(roundResult.append("\n"));
    }

    public Cars getCars() {
        return cars;
    }
}
