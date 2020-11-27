# 객체 지향 구구단 (TimesTable)


### __[요구사항]__
1. 라인 별(2x1=2)로 구구단을 출력한다.
2. Times<Integer>, = 2단 => List
3. TimeLine => 2x1 = 2, 2x2 =4
4. DispalyTimesTable
5. 메소드는 파라미터 1 혹은 없음
6. 필드들에 최대한 많은 final
7. 클래스 보다 인터페이스가 많게 TimesList ext List
8. 인터페이스에 메소드 3개 이하
9. class, enum, interface 있어야 함 enumSet
10. 1 ~ 10 까지 무시해도 됨.  List<ArrayList> ArrayList<List>



### __[작업내용]__
- (1) ```Times``` 클래스를 설계해야 모든 내부 구현에 대한 접근을  권한을 갖는다.
  - times 클래스는 ```Timeable``` 인터페이스를 구현한 클래스를 사용하여 구현됨
  - ```Timeable``` 인터페이스는 ```int getTime()``` 메소드를 가짐
  - 구구단은 2(first) * 1(second) 와 같은 같은 구조를 가지고 있기 때문에, ```Timeable``` 
  실제 구현체인 ```First```클래스와 ```Seconde```클래스를 갖는다.
  - 구구단은 좌에서 우로 읽으면서 결과값을 도출하기 때문에 계산에 대한 주도권은 ```First``` 클래스에서 시작됨
  - ```First```클래스의 주된 기능들은 페키지 레벨 접근을 갖고 있기 때문에 같은 페이지에 있는 ```Times``` 클래스에 의해서만 접근 가능함
  (아이템 17. 변경 가능성을 초소화하라.)
    ![이미지](https://api.monosnap.com/file/download?id=7oH95yBE6dIeV9MGsuotnWCMwf98w9)
- (2) ```List```대신 ```Set```를 사용함
- (3) TimeLine이라는 명칭은 '''TimesResultable''' 인터페이스를 통해서 구현된 클래스가 담당한다.
- (4) ```Times.times(two)``` 정적 메소드 등으로 구성가능
- (5) 생성 역활을 하는 메서드 외에는 메서드의 파라미터 한개만 사용
- (6) 모든 클래스는 final 필드로 구현
- (7) 실제 구현 클래스보다 인터페이스를 많이 생성하기 위해서 FP 사용(SecondTimesCreaterFunction, SecondTimesCreatersSupplier, etc)
- (8) ```default``` 메소드를 제외하고, 인터페이스 안의 메소드는 3개 내외로 구성함
- (9) ```class```, ```inner class```, ```enum```,  ```interface```,  ```EnumSet```등 사용함

### __[주의사항]__
최신 IntelliJ인 경우, 아래의 설정을 해야 정상적으로 테스트 가능함
1. Perferences > Build, Execution, Deployment > Build Tools > Gradle
2. Build And run using, Run test useing 설정 값을 모두 IntelliJ IDEA로 변경 필요