package game.racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> cars) {
        this.carList = cars;
    }

    public int getCountOfCars() {
        return carList.size();
    }

    public Car getCar(int index) {
        return carList.get(index);
    }

    public void reversSortCars() {
        carList.sort(Car::compareTo);
    }

    public List<String> getNameListOfSamePosition(int position) {
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            car.getNameIfSamePosition(position)
                    .ifPresent(stringList::add);
        }

        return stringList;
    }
}
