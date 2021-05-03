package game.racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    void legalNameLength() {
        assertThatNoException().isThrownBy(() -> new CarName("Names"));
    }

    @Test
    void illegalNameLength() {
        assertThatThrownBy(() -> new CarName("Tester"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름의 길이는 5 이하로 제한되어 있습니다.");
    }
}
