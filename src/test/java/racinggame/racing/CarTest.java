package racinggame.racing;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

class CarTest {

    @Test
    void 이름_NULL() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(null))
                .withMessage("[ERROR] 이름은 반드시 입력되어야합니다.");
    }

    @Test
    void 이름_빈값() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(""))
                .withMessage("[ERROR] 이름은 반드시 입력되어야합니다.");
    }

    @Test
    void 이름_길이초과() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car("123456"))
                .withMessage("[ERROR] 이름의 길이는 5자 이하만 가능합니다.");
    }

    @Test
    void 이동시도_정지() {
        Car car = new Car("Tom");

        try (final MockedStatic<Randoms> mockedRandoms = mockStatic(Randoms.class)) {
            mockedRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(3);

            car.tryToMove();
        }

        assertThat(car.getPosition())
                .isZero();

        assertThat(car.getPositionString())
                .isEqualTo("Tom :");
    }

    @Test
    void 이동시도_이동() {
        Car car = new Car("Tom");

        try (final MockedStatic<Randoms> mockedRandoms = mockStatic(Randoms.class)) {
            mockedRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(4);

            car.tryToMove();
        }

        assertThat(car.getPosition())
                .isOne();

        assertThat(car.getPositionString())
                .isEqualTo("Tom : -");
    }
}