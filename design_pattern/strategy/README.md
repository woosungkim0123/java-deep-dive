# Strategy Pattern (전략 패턴)

- 스위치를 전환하듯 알고리즘(전략, 작전, 방안)을 바꿔서 같은 문제를 다른 방법으로 해결할 수 있게 하는 패턴입니다.
- 템플릿 메서드 패턴과 유사하지만 상속이 아닌 위임으로 해결합니다.
- 변하지 않는 부분을 Context에 두고 변하는 부분을 Strategy 인터페이스에 만들고 이걸 구현하도록해서 문제를 해결합니다. (상속이 아닌 위임으로 해결)
- 전략 패턴에서 Context는 변하지 않는 템플릿 역할을 하고 Strategy는 변하는 알고리즘 역할을 합니다.

## 역할

### Strategy(전략) 역할

- 전략(변하는 부분)을 이용하기 위한 인터페이스(API)를 결정합니다.
- 예시에서는 PaymentStrategy 인터페이스가 이 역할을 합니다.

### ConcreteStrategy(구체적인 전략) 역할

- 전략(변하는 부분)을 실제로 구현합니다.
- 예시에서는 KakaoPayStrategy, NaverPayStrategy 클래스가 이 역할을 합니다.

### Context(문맥) 역할

- 전략을 이용하는 역할입니다.
- 변하지 않는 부분을 이곳에 둡니다.
- 예시에서는 ShoppingCart 클래스가 이 역할을 합니다.

![전략 패턴](../image/strategy_pattern.png)