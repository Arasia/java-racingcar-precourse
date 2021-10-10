package racinggame.racing;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

class CarsTest {

    @Test
    void 현재상태확인() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tom"));
        carList.add(new Car("Sam"));

        Cars cars = new Cars(carList);

        try (final MockedStatic<Randoms> mockedRandoms = mockStatic(Randoms.class)) {
            mockedRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(4);

            cars.tryToMoveAllCar();
            cars.tryToMoveAllCar();
        }

        assertThat(cars.getPositionStringAllCar())
                .isEqualTo("Tom : --\nSam : --");
    }

    @Test
    void 제일빠른차랑_유일() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tom"));
        carList.add(new Car("Sam"));

        Cars cars = new Cars(carList);

        try (final MockedStatic<Randoms> mockedRandoms = mockStatic(Randoms.class)) {
            mockedRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(4, 3);

            cars.tryToMoveAllCar();
        }

        assertThat(cars.getFastestCarsName())
                .isEqualTo("Tom");
    }

    @Test
    void 제일빠른차랑_중복() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tom"));
        carList.add(new Car("Sam"));

        Cars cars = new Cars(carList);

        try (final MockedStatic<Randoms> mockedRandoms = mockStatic(Randoms.class)) {
            mockedRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(4);

            cars.tryToMoveAllCar();
        }

        assertThat(cars.getFastestCarsName())
                .isEqualTo("Tom,Sam");
    }
}
