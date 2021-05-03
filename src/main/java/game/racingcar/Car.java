package game.racingcar;

import java.util.Objects;
import java.util.Optional;

public class Car implements Comparable<Car> {
    private final CarName carName;
    private final Position position = new Position();
    private Fuel fuel = new Fuel(0);

    public Car(String name) {
        this.carName = new CarName(name);
    }

    public Car setFuel(Fuel fuel) {
        this.fuel = fuel;
        return this;
    }

    public Car move() {
        if (isMove()) {
            position.positionPlusOne();
        }

        return this;
    }

    public boolean isMove() {
        return fuel.useAllOfOil() > 3;
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getPosition() {
        return position.getCurrentPosition();
    }

    public String getRaceState() {
        StringBuilder sb = new StringBuilder();
        sb.append(carName.getName()).append(" : ");
        for (int i = 0; i < position.getCurrentPosition(); i++) {
            sb.append("-");
        }

        return sb.toString();
    }

    public Optional<String> getNameIfSamePosition(int position) {
        if (this.position.getCurrentPosition() == position) {
            return Optional.of(carName.getName());
        }

        return Optional.empty();
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.position.getCurrentPosition(), this.position.getCurrentPosition());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
