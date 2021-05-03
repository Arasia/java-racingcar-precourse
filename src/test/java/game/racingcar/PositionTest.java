package game.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {
    private Position position;

    @BeforeEach
    void initTest() {
        position = new Position();
    }

    @Test
    void positionPlusOneTest() {
        int prePosition = position.getCurrentPosition();

        position.positionPlusOne();
        int currentPosition = position.getCurrentPosition();

        assertThat(currentPosition)
                .isEqualTo(prePosition + 1);
    }
}
