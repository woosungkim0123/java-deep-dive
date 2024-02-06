# Decorator Pattern

- 객체에 장식이 되는 기능을 하나씩 추가해 목적에 더 맞는 객체로 만들어가는 패턴입니다.
- 기존 코드를 변경하지 않고도 객체의 기능을 확장할 수 있다는 점에서 유용합니다.

## 데코레이터 패턴을 사용시와 사용하지 않을 때 예시 차이

케이크에 장식을 하는 예시를 들어보겠습니다.

### 데코레이터 패턴을 사용하지 않았을 때

장식을 예로 들었을 때, 각 장식을 조합하는 모든 경우의 수를 클래스로 만들어야 합니다. 

예를 들어, 케이크에 추가할 수 있는 장식이 4개(예: 크림, 과일, 초콜릿 소스, 캔디)가 있다고 가정하면, 
이들의 모든 순서를 고려한 조합을 만들어야 하므로, 4! = 24개의 조합 클래스가 필요합니다. 

이는 관리해야 할 클래스의 수가 매우 많아지고, 장식이 추가될 때마다 이 수는 기하급수적으로 늘어나 관리가 어려워집니다.

### 데코레이터 패턴을 사용했을 때

데코레이터 패턴을 사용하면, 각 장식을 데코레이터 클래스로 만들고, 이를 케이크 객체에 동적으로 추가하여 조합할 수 있습니다. 

따라서 장식 4개를 위한 4개의 데코레이터 클래스만 있으면 되며, 이들을 조합하여 원하는 대로 케이크를 꾸밀 수 있습니다. 

이 방식은 필요한 장식 조합을 런타임에 결정할 수 있게 해주어, 훨씬 더 유연하고 확장 가능한 설계를 할 수 있게 합니다.

## 역할

### Component

- 기능을 추가할 때 핵심이 되는 역할입니다.
- 예시에서는 Cake 인터페이스가 이 역할을 합니다.

### ConcreteComponent

- Component 역할의 구현체로, 기본 케이크를 의미합니다.
- 예시에서는 BasicCake 클래스가 이 역할을 합니다.

### Decorator

- Component 역할과 동일한 인터페이스를 가지며, 데코레이터 역할을 하는 클래스입니다.
- 예시에서는 CakeDecorator 추상 클래스가 이 역할을 합니다.

### ConcreteDecorator

- Decorator 역할의 구현체로, 실제로 기능을 추가하는 클래스입니다.
- 예시에서는 StrawberryDecorator, ChocolateDecorator 등이 이 역할을 합니다.

![데코레이터 패턴](../image/decorator_pattern.png)