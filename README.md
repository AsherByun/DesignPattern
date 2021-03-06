# DesignPattern

# 생성 패턴
- 객체 생성에 관련된 패턴
- 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.
## 싱글톤 메서드
- 전역 변수를 사용하지 않고 객체를 하나만 생성 하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴
- 애플리케이션 실행시, 최초 한번만 메모리를 할당(static)하고 해당 메모리에 인스턴스를 만들어 사용
- 생성자 private  getInstance 사용
- 한번만 생성하기 때문에 메모리 낭비 방지
- ex) 데이터 베이스 커넥션 풀, 스레드 풀, 캐시, 로그 기록 객체 등등 + 장치 설정 객체
- 단점
  - 싱글톤 하나에 너무많은 일을 하거나, 공유하면 객체간의 결합도가 높아져 유지보수, 테스트가 어려워짐
  - 멀티스레드 환경에서 동기화 처리를 하지 않았을 때, 인스턴스가 2개 상성 + 동시성 문제 발생 가능 -> synchronize , volatile 사용
## 팩토리 메서드
- 객체 생성 부분을 Sub Class에 맡기는 패턴
- 객체의 자료형이 하위 클래스에 의해서 결정 -> 확장 용이성
- 객체가 늘어날 때마다 하위 클래스 재정의로 인한 불필요한 많은 클래스 생성 가능성 제거
- 특정 기능의 구현은 개별 클래스를 통해 제공되는 것이 바람직한 설계이다
  - 객체 생성 방식의 변화는 해당되는 모든 코드 부분을 변경해야 하는 문제가 발생한다.
![image](https://user-images.githubusercontent.com/47214171/116032642-050fdf00-a69b-11eb-9889-8349eba022d5.png)
1. 객체 생성을 전담하는 별도의 Factory클래스 이용 -> 싱글턴, 스트래티지 패턴 적용
2. 상속 이용 -> 하위 클래스에서 적합한 클래스 객체 생성
- 예제 https://gmlwjd9405.github.io/2018/08/07/factory-method-pattern.html
- RobotFactory
# 구조 패턴
- 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴
- 예를 들어 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나 객체들을 서로 묶어 새로운 기능을 제공하는 패턴이다.

## 데코레이터 패턴 (Decorator Pattern)
- 어떤 기능에 추가적으로 기능을 덧 붙이고 싶은 경우, 그 기능들을 데코레이터로 만들어 덧붙이는 방식
- ex) 센드위치, 로봇 방패,검
  ![image](https://user-images.githubusercontent.com/47214171/116039179-60df6580-a6a5-11eb-8407-2931ad488eed.png)
# 행위 패턴
## 전략 패턴 (스트레티지)
- 행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있는 패턴
  - 같은 문제 해결하는 알고리즘이 클래스별로 캡슐화 되어 이들이 필요할 때 교체할 수 있도록 함으로 써 동일한 문제를 다른 알고리즘으로 해결할 수 있게하는 디자인 패턴
- 전략을 바꿀 수 있도록 해주는 디자인 패턴 -> 어떤 모겆ㄱ을 달성하기 위해 일하는 방식, 비즈니스 로직, 알고리즘 등..
- 게임 프로그래밍에서 공격이나 스킬 등에 많이 사용
- OCP 와 중복을 피하고 일관성있는 코드를 만들어야 한다
![image](https://user-images.githubusercontent.com/47214171/116030508-a9435700-a696-11eb-996d-4bc485fea462.png)
  - 역할이 수행하는 작업
    - Strategy
      - 인터페이스나 추상 클래스로 외부에서 동일한 방식으로 알고리즘을 호출하는 방법을 명시
    - ConcreteStrategy
      - 스트래티지 패턴에서 명시한 알고리즘을 실제로 구현한 클래스
    - Context
      - 스트래티지 패턴을 이용하는 역할을 수행한다.
    - 필요에 따라 동적으로 구체적인 전략을 바꿀 수 있도록 setter 메서드(‘집약 관계’)를 제공한다.
- 해당 패턴은 로봇의 공격을 통해 구현함
  - Attack interface - MissileAttack class & - PunchAttack
