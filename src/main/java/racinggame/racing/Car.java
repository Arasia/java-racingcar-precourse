package racinggame.racing;

import nextstep.utils.Randoms;

public class Car {
    private static final int MIN_NUMBER_FOR_MOVE = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);

        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 이름은 반드시 입력되어야합니다.");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름의 길이는 5자 이하만 가능합니다.");
        }
    }

    public void tryToMove() {
        int randomNum = Randoms.pickNumberInRange(0, 9);

        if (MIN_NUMBER_FOR_MOVE <= randomNum) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionString() {
        StringBuilder sb = new StringBuilder(name + " : ");

        for (int i = 0; i < position; i++) {
            sb.append("-");
        }

        return sb.toString().trim();
    }
}
