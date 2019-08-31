# 구구단 (TimesTable)


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
1. Times 클래스를 설계해야 모든 내부 구현에 대한 접근을  권한을 갖는다.
2. '''times(two, 1)''' 혹은 '''times(two)'''를 통해 구구단을 출력한다.
3. TimeLine이라는 명칭은 '''TimesResultable''' 인터페이스를 통해서 구현된 클래스가 담당한다.
4. 스트레이지 패턴을 사용하여 구현 예정
5. 클래스 생성자 역활을 하는 메서드 외에는 메서드 한개만 사용
6. 모든 클래스는 final 필드로 구현
