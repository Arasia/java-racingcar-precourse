package game.racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FuelTest {
    @Test
    void legalOil() {
        assertThatNoException()
                .isThrownBy(() -> new Fuel(3));
    }

    @Test
    void illegalOil() {
        assertThatThrownBy(() -> new Fuel(10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("오일의 범위는 0~9 입니다.");
    }
}
