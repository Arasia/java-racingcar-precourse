package game.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {
    private Racing racing;

    @BeforeEach
    void initRacingTest() {
        racing = new Racing("Tom,Peter,Sam", 5);
    }

    @Test
    void winnerIsTom() {
        Cars cars = racing.getCars();

        for (int i = 0; i < cars.getCountOfCars(); i++) {
            Car car = cars.getCar(i);
            if (car.getCarName().equals("Tom")) {
                car.setFuel(new Fuel(4)).move();
                continue;
            }

            car.setFuel(new Fuel(3)).move();
        }

        assertThat(racing.getWinner())
                .isEqualTo("Tom");
    }

    @Test
    void duplicateWinner() {
        Cars cars = racing.getCars();

        for (int i = 0; i < cars.getCountOfCars(); i++) {
            cars.getCar(i).setFuel(new Fuel(3)).move();
        }

        assertThat(racing.getWinner())
                .isEqualTo("Tom,Peter,Sam");
    }
}
