package game.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    private Cars cars;

    @BeforeEach
    void initCarsTest() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tom"));
        carList.add(new Car("Peter"));
        carList.add(new Car("Sam"));

        cars = new Cars(carList);
    }

    @Test
    void getCountOfCars() {
        assertThat(cars.getCountOfCars())
                .isEqualTo(3);
    }

    @Test
    void reversSortCars() {
        cars.getCar(2).setFuel(new Fuel(4)).move();
        cars.reversSortCars();

        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < cars.getCountOfCars(); i++) {
            nameList.add(cars.getCar(i).getCarName());
        }

        assertThat(String.join(",", nameList))
                .isEqualTo("Sam,Tom,Peter");
    }
}
