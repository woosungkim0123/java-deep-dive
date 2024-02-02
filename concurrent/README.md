# 자바 동시성 프로그래밍

## 동시성 소프트웨어란?

동시성 소프트웨어는 동시에 여러 작업을 수행할 수 있는 소프트웨어를 의미합니다. 예를 들어, SNS 사용 중 음악을 듣거나, 동영상을 보면서 채팅을 하는 등 다양한 작업을 동시에 할 수 있습니다.

자바에서는 멀티 프로세싱(ProcessBuilder 사용)과 멀티 스레딩을 통해 이러한 동시성을 지원합니다.

## 스레드

### 스레드 주요 기능

- sleep: 주어진 시간동안 쓰레드를 멈추게 합니다.
- interrupt: 쓰레드를 깨워서 interruptedExeption을 발생시킵니다.
- join: 다른 쓰레드가 끝날 때까지 기다립니다.

### 스레드 관리의 복잡성

프로그래머가 수십, 수백 개의 스레드를 직접 관리하는 것은 실질적으로 불가능하며 바람직하지 않습니다. 

각 스레드의 생명 주기를 관리하고, 자원을 효율적으로 할당하며, 동시성 문제(예: 경쟁 상태, 데드락)를 해결하는 것은 매우 복잡한 과정입니다.

## Executors

Executors는 자바에서 스레드 생성과 관리를 쉽게 만들어주는 고수준 API입니다. 이를 통해 개발자는 복잡한 스레드 관리 없이도 효과적으로 동시성을 구현할 수 있습니다.

### Executors가 하는 일

- 쓰레드 생성: Executors는 애플리케이션에 필요한 쓰레드 풀을 생성하고 관리합니다. 이를 통해 개발자는 필요한 만큼의 쓰레드를 효율적으로 사용할 수 있습니다.

- 쓰레드 관리: Executors는 생성된 쓰레드들의 생명 주기를 관리합니다. 이는 자원 사용 최적화와 안정적인 쓰레드 운영에 기여합니다.

- 작업 처리 및 실행: Executors는 쓰레드에서 실행할 작업을 스케줄링하고 실행하는 API를 제공합니다. 이를 통해 개발자는 작업을 쉽게 분배하고 실행할 수 있습니다.

### execute vs submit

**execute()**

- Runnable 객체를 인자로 받아 실행하다보니 반환 값이 없고, 작업의 완료나 결과를 직접 확인할 수 없습니다.
- 작업 중 예외가 발생하면, 쓰레드에서 이를 처리하지 않고 종료됩니다.

**submit()**

- Runnable 또는 Callable 객체를 인자로 받습니다.
- Future 객체를 반환하며, 이를 통해 작업의 결과를 얻거나, 작업의 완료를 확인하거나, 작업을 취소할 수 있습니다. Callable 사용 시, 작업 중 발생한 예외는 Future 객체를 통해 확인할 수 있습니다.

즉, execute()는 작업을 실행만 하고 결과 처리는 하지 않는 반면, submit()은 작업 실행 후 결과를 다룰 수 있는 Future 객체를 반환하여 더 유연한 작업 처리와 예외 관리를 가능하게 합니다.

### Runnable과 Callable

**Runnable**

- 작업 실행에 사용되는 인터페이스입니다.
- 작업 처리 결과를 반환하지 않으며, 예외를 던지지 않습니다.

**Callable**

- 작업 처리 결과를 반환할 수 있는 인터페이스입니다.
- 예외를 던질 수 있으며, 이는 Future 객체를 통해 관리될 수 있습니다.

## CompletableFuture

Future 인터페이스의 확장이며, Future의 제한적인 기능을 개선하고 더욱 유연한 비동기 작업 처리를 가능하게 합니다.

### Future에서 개선된 점

- Future의 작업 결과를 쉽게 외부에서 완료시킬 수 있습니다.
- 작업 중 발생하는 예외를 잡아 처리할 수 있습니다.
- 여러 Future를 조합할 수 있습니다.
- Future만 있었을 때는 콜백을 get() 호출 전에 정의하는 것이 불가능 했는데 가능하도록 변경되었습니다.

## ForkJoinPool

ForkJoinPool은 Java의 멀티스레딩과 병렬 처리를 위한 강력한 도구입니다. 병렬 처리와 관련된 작업, 특히 CPU 집약적인 작업과 대규모 데이터 처리에 적합합니다.

### ForkJoinPool의 주요 특징

1. 작업 훔치기(Work-Stealing) 알고리즘
- ForkJoinPool의 각 스레드는 자신만의 작업 큐(Deque, 이중 끝 큐)를 가지고 있습니다. 스레드가 자신의 작업을 완료하면, 다른 스레드의 큐에서 남은 작업을 '훔쳐서' 처리합니다.
이는 스레드 간의 작업 부하를 고르게 분배하는 데 도움이 됩니다.

2. 병렬 처리에 최적화

- 재귀적인 작업 분할에 적합하게 설계되어 있어 대규모 데이터 처리나 복잡한 계산에 효과적입니다.

3. Fork/Join 프레임워크

- ForkJoinTask를 사용하여 큰 작업을 더 작은 하위 작업으로 분할하고(fork), 이후 병렬로 처리한 작업 결과를 결합(join)합니다.

4. 비동기 작업 처리

- 명시적인 스레드 풀 생성 없이 비동기 작업을 관리합니다. CompletableFuture와 함께 사용될 때, ForkJoinPool은 기본적으로 이의 비동기 작업을 처리하는 데 사용됩니다.

### 사용 시 주의점

- 작업들이 서로 간섭하지 않고 독립적으로 수행될 때 가장 효율적입니다. 작업 간 의존성이나 공유 자원 접근이 필요한 경우, 성능 문제가 발생할 수 있습니다.

- 너무 많은 작업 분할은 오버헤드를 초래할 수 있으므로, 분할과 병합을 적절히 설계하는 것이 중요합니다.

- 필요한 경우, 다른 Executor를 통해 생성된 스레드를 ForkJoinPool에 전달하여 사용할 수도 있습니다. (두번째 인자)