# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항

* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다. •자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
* 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
* 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.

## 기능 목록

### 자동차

* 이름
    * 5자 이하
* 이동시도
    * Random 값 생성하고 결과에 따라 이동여부를 결정한다.
        * 4 이상일 경우 전진한다.
        * 3 이하일 경우 정지한다.

### 레이싱

#### 레이싱 시작 전

* 레이싱 시작 전 사용자에게 참가할 자동차들의 이름을 입력받는다.
    * 이름은 하나의 라인에 쉼표(,)를 기준으로 구분되어 입력한다.
    * 구분된 이름의 갯수를 통하여 레이싱에 참여할 자동차를 생성한다.
      * 입력받은 순서대로 생성한다.
* 총 시도할 횟수를 사용자에게 입력받는다.

#### 레이싱 진행

* 사용자에게 입력받은 총 시도할 횟수만큼 라운드를 진행한다.
* 각각의 라운드 별 수행 사항
    * 모든 자동차는 이동시도를 진행한다.
    * 모든 자동차가 이동시도를 완료하면 현재 진행상황을 출력한다.
        * 진행상황은 자동차 이름과 전진한 횟수를 "-"로 표시한다.
        * 진행상황 출력 순서는 이름을 입력받은 순서대로 출력한다.

#### 레이싱 종료

* 모든 라운드가 완료 되면 레이싱은 종료된다.
* 레이싱이 종료되면 우승자를 출력한다.
    * 우승자는 한명 이상일 수 있다.

### 공통

* 사용자가 잘못된 값을 입력할 경우
    * "[ERROR]"로 시작하는 에러메세지 출력한다.
    * 사옹자에게 해당 입력을 다시 받는다.
