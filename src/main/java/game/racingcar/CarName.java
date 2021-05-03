package game.racingcar;

import java.util.Objects;

public class CarName {
    final String name;

    public CarName(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    private void validateCarNameLength(String name) {
        int length = name.length();
        if (length > 5) {
            throw new IllegalArgumentException("자동차 이름의 길이는 5 이하로 제한되어 있습니다.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarName)) return false;
        CarName carName = (CarName) o;
        return Objects.equals(this.name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
