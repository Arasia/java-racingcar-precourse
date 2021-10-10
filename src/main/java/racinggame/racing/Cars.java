package racinggame.racing;

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
        FastestCars fastestCars = new FastestCars();

        for (Car car : carList) {
            fastestCars.fastestCarCheck(car);
        }

        return fastestCars.getFastestCarsName();
    }
}
