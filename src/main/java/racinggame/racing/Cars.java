package racinggame.racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }


    public void tryToMoveAllCar() {
        for (Car car : carList) {
            car.tryToMove();
        }
    }

    public String getPositionStringAllCar() {
        StringBuilder sb = new StringBuilder();

        for (Car car : carList) {
            sb.append(car.getPositionString())
                    .append("\n");
        }

        return sb.toString().trim();
    }

    public String getFastestCarsName() {
        List<String> fastestCarNameList = new ArrayList<>();
        int maxPosition = Integer.MIN_VALUE;

        for (Car car : carList) {
            maxPosition = fastestCarCheck(car, maxPosition, fastestCarNameList);
        }

        return String.join(",", fastestCarNameList);
    }

    private int fastestCarCheck(Car car, Integer maxPosition, List<String> fastestCarNameList) {
        if (maxPosition < car.getPosition()) {
            fastestCarNameList.clear();
            fastestCarNameList.add(car.getName());
            return car.getPosition();
        }

        if (maxPosition == car.getPosition()) {
            fastestCarNameList.add(car.getName());
        }

        return maxPosition;
    }
}
