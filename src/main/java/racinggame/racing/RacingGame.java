package racinggame.racing;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RacingGame {

    private static final String GET_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String GET_TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

    public void start() {
        Racing racing = generateNewRacing();

        racing.startRacing();
    }

    private Racing generateNewRacing() {
        List<Car> carList = getCarNameList();
        int tryCount = getTryCount();

        return new Racing(new Cars(carList), tryCount);
    }

    private List<Car> getCarNameList() {
        List<Car> carList = new ArrayList<>();

        do {
            carList.clear();
        } while (getCarNamesForUser(carList));

        return carList;
    }

    private boolean getCarNamesForUser(List<Car> carList) {
        System.out.println(GET_CAR_NAME_MESSAGE);
        StringTokenizer st = new StringTokenizer(Console.readLine(), ",");

        try {
            generateCarList(carList, st);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return true;
        }
        return false;
    }

    private void generateCarList(List<Car> carList, StringTokenizer st) {
        while (st.hasMoreTokens()) {
            carList.add(new Car(st.nextToken()));
        }
    }

    private int getTryCount() {
        System.out.println(GET_TRY_COUNT_MESSAGE);
        return Integer.parseInt(Console.readLine());
    }
}
