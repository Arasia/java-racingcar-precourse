package game.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private Car car;

    @BeforeEach
    public void initCarTest() {
        car = new Car("Test");
    }

    @Test
    void positionIsChange() {
        int prePosition = car.getPosition();

        assertThat(car.setFuel(new Fuel(4)).move().getPosition())
                .isNotEqualTo(prePosition);
    }

    @Test
    void positionIsNotChange() {
        int prePosition = car.getPosition();

        assertThat(car.setFuel(new Fuel(3)).move().getPosition())
                .isEqualTo(prePosition);
    }

    @Test
    void reuseOil() {
        int prePosition = car.getPosition();
        int firstPosition = car.setFuel(new Fuel(4)).move().getPosition();
        int secondPosition = car.move().getPosition();

        assertThat(firstPosition)
                .isNotEqualTo(prePosition);
        assertThat(secondPosition)
                .isEqualTo(firstPosition);
    }

    @Test
    void carIsMove() {
        assertThat(car.setFuel(new Fuel(4)).isMove())
                .isTrue();
    }

    @Test
    void carIsStop() {
        assertThat(car.setFuel(new Fuel(3)).isMove())
                .isFalse();
    }

    @Test
    void printCarRaceState() {
        assertThat(car.setFuel(new Fuel(4)).move().getRaceState())
                .isEqualTo("Test : -");
    }
}
