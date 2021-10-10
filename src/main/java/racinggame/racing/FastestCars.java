package racinggame.racing;

import java.util.ArrayList;
import java.util.List;

public class FastestCars {
    private final List<Car> fastestCarList;
    private int fastestPosition;

    public FastestCars() {
        this.fastestCarList = new ArrayList<>();
        this.fastestPosition = Integer.MIN_VALUE;
    }

    public void fastestCarCheck(Car car) {
        if (this.fastestPosition < car.getPosition()) {
            clearAndAddCar(car);
            return;
        }

        if (this.fastestPosition == car.getPosition()) {
            addCar(car);
        }
    }

    private void clearAndAddCar(Car car) {
        fastestCarList.clear();
        fastestCarList.add(car);
        fastestPosition = car.getPosition();
    }

    private void addCar(Car car) {
        fastestCarList.add(car);
    }

    public String getFastestCarsName() {
        List<String> fastestCarNameList = new ArrayList<>();

        for (Car car : fastestCarList) {
            fastestCarNameList.add(car.getName());
        }

        return String.join(",", fastestCarNameList);
    }
}
