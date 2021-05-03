# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
* `주어진 횟수` 동안 `n대`의 자동차는 `전진` 또는 `멈출` 수 있다.
* 각 `자동차`에 `이름`을 부여할 수 있다.
* 전진하는 `자동차`를 `출력`할 때 `자동차 이름`을 같이 `출력`한다.
* `자동차 이름`은 `쉼표(,)`를 기준으로 구분하며 `이름`은 `5자 이하`만 가능하다.
* `사용자`는 `몇 번의 이동`을 할 것인지를 `입력`할 수 있어야 한다.
* `전진하는 조건`은 `0에서 9 사이`에서 `random` 값을 생성
    * `random` 값이 `4 이상`일 경우 `전진`한다.
    * `random` 값이 `3 이하`일 경우 `정지`한다.
* 자동차 경주 `게임을 완료한 후` 누가 우승했는지를 알려준다.
    * `우승자`는 `한 명 이상`일 수 있다.
    
## 개발 요구사항
* `자동차`
  * `이름`
    * `5자 이내`의 `이름`을 가짐
  * `위치`
    * `연료`가 `4 이상`일 경우 `전진`
    * `연료`가 `3 이하`일 경우 `정지`
  * `연료`
    * `0 ~ 9`의 범위를 가짐
* `레이싱`
  * `자동차`를 `n`대 포함
    * 각각의 `자동차 이름`을 `사용자`에게 `입력` 받음
      * `이름`은 `쉼표(,)`를 기준으로 구분
  * `라운드`
    * `사용자`에게 `총 라운드 수`를 `입력`받음
    * `라운드`별 각각의 `자동차`는 `random`으로 생성 된 `연료`을 받음
      * `random`의 범위는 `0 ~ 9`
    * 각각의 `라운드`별 `진행상황`을 `출력`
      * `진행상황`은 `자동차 이름`과 `전진한 횟수`를 `-`로 표시
      * `자동차 이름`을 `입력받은 순서`대로 `출력`
  * `게임이 완료된 후` 누가 우승했는지 `출력`
    * `우승자`는 `한명 이상`일 수 있다.

## 실행방법
* application Package에 포함된 Application의 main method 을 실행하여 시작한다.
