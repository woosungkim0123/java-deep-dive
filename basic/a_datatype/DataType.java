public class DataType {
    public static void main(String[] args) {
        // 자바 등장 전 사람이 직접 메모리 관리 => 메모리 사용 후 반환하지 않아서 메모리 부족으로 프로그램 사망
        // 자바에는 가비지 컬렉터(GC)가 있어서 메모리를 자동으로 정리

        // 멀티 스레드 지원(하나의 프로그램에 동시에 여러 작업 가능)

        // 운영체제에 독립적
        // VM : 가상 컴퓨터, 실제 컴퓨터가 아니라 소프트웨어로 만들어진 컴퓨터
        // 자바프로그램이 실행되는 가상 컴퓨터(JVM)
        // 일반 어플리케이션은 OS(운영체제)에서 실행되지만 자바는 JVM 위에서 실행되기 때문에 OS와 독립적일 수 있음

        // 패키지 : 관련된 클래스들을 모아둔 것
        // JDK : Java Development Kit
        // 자바를 이용해서 프로그램을 개발할 때 사용하는 여러 도구들을 모아서 제공하는 개발자용 버전 자바

        // javac : 자바파일을 컴파일
        // 환경변수를 설정하면 컴퓨터가 실행파일을 찾을때 현재 디렉토리에 없으면 환경변수에 등록된 제일 위 경로부터 순서대로 찾음
        // 만약 환경변수가 없으면 터미널에서 c:/javac위치/javac 클래스명.java

        // 컴파일러인 javac가 hello.java를 읽어서 jvm이 이해할 수 있는 기계어로 변환
        // type Hello.class를 입력해서 확인해보면 사람이 알아 볼 수 없는 언어로 된 것을 알 수 있다(바이너리 파일 or 이진파일)
        // hello.java처럼 사람이 알아볼 수 있는 파일을 텍스트 파일
        // 실행하려면 java Hello(class이름), 이때는 확장자를 붙이지 않음

        // 변수
        // 하나의 값을 저장할 수 있는 메모리 공간
        // 원래 메모리의 값을 저장하거나 읽을 때 메모리 주소를 이용해야 하지만 메모리 주소는 숫자라서 사람이 기억하기 힘들고 불편함
        // 그래서 특정 메모리 영역에 이름을 붙이고 주소 대신에 이름을 이용해서 메모리의 값을 저장하고 읽을 수 있게 한 것이 변수
        // 변수는 단 하나의 값만 저장할 수 있기 때문에 변수에 새로운 값을 저장하면 기존 저장 값은 지워지고 새로 저장한 값만 남게됨

        // 메모리에 값을 저장하려면 먼저 변수를 선언해야 한다.
        // 선언 이유 : 값(data)을 저장할 공간을 마련하기 위해
        int age;
        age = 25;

        int age1 = 30;
        int x = 3, y = 4;

        // 선언된 변수에 처음으로 값을 저장하는 것을 변수 초기화
        // 모든 변수는 사용하기전 적절한 값으로 초기화 하는 것이 좋다
        // 메모리는 여러 프로그램이 함께 공유하는 자원임으로 사용하기 전에 새로운 값을 저장함으로써
        // 기존의 저장되어 있는 알 수 없는 값을 지우는 것이 바로 초기화

        // 상수(constant) : 한번만 값을 저장 가능한 변수
        final int score = 100;
        // score = 200; 에러

        // 리터럴 : 값을 의미
        // score1은 변수, 100은 리터럴
        int score1 = 100;

        // 접미사
        // 정수형과 실수형은 타입이 여러개라서 접미사를 붙여서 구분, 대소문자 구별안함
        // byte와 short 타입의 경우 리터럴이 없어서 byte 타입의 변수에 값을 저장하면 integer type의 리터럴을 사용
        // 정수형에 L이 붙어있으면 long타입
        long a = 100L;

        // float는 f, double은 d(생략가능)
        float b = 1.4f;
        double c = 3.14d; // d 생략가능

        // byte 범위 : -128 ~ 127
        // int 타입의 최대값이 대략 20억
        // 20억이 넘는 값은 long 타입에 담아야 함
        // long 타입 변수에 값을 저장할 때 int 타입의 리터럴을 써도 되기 때문에 접미사를 붙이건
        // 안 붙이건 상관없지만 대부분 int 타입의 최대값인 20억을 넘는 값이기 때문에 반드시 접미사 L을 붙여야한다.

        long d = 10_000_000_000L; // 100억 (L 안붙이면 에러)
        long e = 100;

        // 10진법 외에 다른 진법으로도 표현 가능
        // 접미사 처럼 접두사도 대소문자 구별 X
        int i = 100; // 10진수
        int oct = 0100; // 접두사 0이 붙으면 8진수
        int hex = 0x100; // 0x가 붙으면 16진수
        int bin = 0b0101; // 접두 0b가 붙으면 2진수

        // 둘다 모두 실수형 리터럴이고 접미사가 없으니 double타입 리터럴이다.
        double f = 10.; // 10.0에서 0이 생략된 것
        double g = .10; // 0.10에서 앞에 0이 생략된 것

        // 실수형 접미사 => 실수형 리터럴
        float h = 10f; // 10.0f와 의미가 같음.

        // e : 10^n
        double j = 1e3; // 10^3 = 1000, 기호 e는 실수형에 사용되는 것이기 때문에 1000.0, double 타입

        // 변수에 저장할 리터럴의 타입은 변수의 타입과 일치하는 것이 일반적, 반드시 일치해야 하는 것은 아님
        // 범위가 변수(담을 그릇) > 리터럴(물건) 인 경우, OK
        int k = 'A';
        // integer 타입의 변수 k에 문자 A가 저장되는 것이 아닌 문자 A의 문자코드인 65가 저장
        // 저장하려는 리터럴의 타입이 char 타입이지만 변수의 타입이 int 라서 저장범위가 넓어서 가능

        long l = 123; // long > int
        double m = 3.14f; // double > float
        // long n = 3.14f; 에러
        // long: 8byte, float : 4byte 라서 될 것 같지만 실수형은 정수형보다 저장범위가 넓음

        // String
        // String은 자바에서 제공하는 클래스
        // 자주 사용하기 때문에 String 클래스만 특별하게 기본형 변수에 값을 저장하는 것과 같은 표현을 허용함

        String n = "AB";
        String o = new String("AB"); // 원래 형태
        // 원래 참조변수 n에는 문자열 AB의 주소가 저장되는데 단순히 변수 n에 문자열 AB가 저장된다고 생각해도 됨
        // 두 문장의 약간의 차이가 있음

        String p = ""; // 빈 문자열
        // char q = ''; 에러
        String r = "A" + "B"; // "AB"

        // "" + 7 -> "7" (숫자 -> 문자열 변환)
        // 주의점은 문자열 결합은 왼쪽에서 오른쪽으로 진행 => 순서에 따라 다른 결과
        // "" + 7 + 7 => "7" + 7 => "77"
        // 7 + 7 + "" => "14"

        // 문자열 + any type → 문자열
        // any type + 문자열 → 문자열

        // 기본형(8개)
        // boolean, char, byte, short, int, long, float, double
        // 실제 값을 저장
        // 타입마다 크기가 다름

        // 참조형
        // 기본형을 제외한 나머지(String, System 등)
        // 메모리 주소를 저장
        // 타입에 관계없이 변수의 크기가 항상 4byte(32비트 JVM의 경우 4바이트, 64비트 JVM의 경우 8바이트)
        // 참조변수는 객체의 주소를 저장하기 위한 것이라고 생각하기

        // boolean은 1비트만 있어도 되지만 자바 최소 단위가 1바이트라 1바이트(1비트는 2진수 1자리를 의미, 1바이트는 8비트)
        // char는 2바이트(자바는 2바이트 문자쳬게인 유니코드를 사용하기 때문), c는 1바이트임
        // int(4바이트)를 기준으로 작으면 short(2바이트), 크면 long(8바이트)
        // 실수형은 실수를 부동소수점(floating point)형식으로 저장하기 때문에 이름이 float, 부동 = 둥둥 떠 다닌다
        // double(8바이트)은 float(4바이트)보다 정밀도가 두배라서 double
        // 정수형에서 기본은 int, 실수형은 double

        byte s;
        s = 3;
        // s은 1바이트(8비트)니까 3이 저장되면 2진수로 변경되어서 11, 8비트를 채우면 00000011

        // 정수형의 표현범위
        // n 비트로 표현할 수 있는 값의 개수 : 2^n개, 8비트는 2^8 = 256개 값 표현 가능
        // n 비트로 표현할 수 있는 부호없는 정수 범위 : 0 ~ 2^n-1 (0을 포함시켜서 1빼기)
        // n 비트로 표현할 수 있는 부호있는 정수 범위 : -2^(n-1) ~ 2^(n-1)-1

        // byte
        // 전체 8비트 중 맨 왼쪽 1비트의 값을 부호를 나타내는데 사용(부호비트, sign bit라 부름)
        // 부호비트의 값이 0이면 양수, 1이면 음수
        // 0(부호비트) + 7bit => 2^7 : 128개 * 2(양수(0 ~ 127), 음수(-1 ~ -128) = 2^8 = 256개

        // char
        // char는 지정된 문자코드로 변환되어 저장
        // char 'A'의 경우 65가 저장, 엄밀히 말하면 0000000001000001로 저장
        // char은 부호가 없는 정수의 범위

        // short : -2^15 ~ 2^15-1
        // char : 0 ~ 2^16-1

        // int
        // 4byte = 32bit
        // 범위는 -20억 ~ 20억 정도
        // -2^31 ~ 2^31-1

        // long
        // 혹시라도 800경을 넘는 수를 다뤄야한다면 실수타입 or bigInteger 클래스를 사용
        // -2^63 ~ 2^63-1 (-800경 ~ 800경)

        // 실수형
        // E는 10의 제곱을 표현 (예시 : E38 = 10^38)
        // float는 정밀도 7자리 double은 15자리

        // float
        // int랑 같은 4바이트인데 큰 수를 저장할 수 있는 이유는 저장형식 때문
        // 대신 정수형과 달리 실수형은 원래 저장하려는 값과 실제로 저장된 값 사이에 오차가 발생할 수 있음
        // 오차가 발생할 수 있기 때문에 정밀도라는 것이 중요함
        // float는 4byte = 32bit
        // 1bit는 부호, 8비트는 지수, 23비트는 가수
        // 3.4(가수) x 10^38(지수)

        // 정밀도는 값을 몇자리까지 오차없이 정확하게 표현할 수 있는지를 의미
        // 정밀도를 결정하는 것은 가수의 자리수
        // float의 가수는 23자리지만 정규화를 통해서 24자리까지 저장할 수 있음
        // 10^7 < 2^24 < 10^8 ⇒ 그래서 float의 정밀도가 7자리
        // double은 float의 약 2배, 정밀도도 약 2배 ⇒ 15자리

        // 실수를 저장할 타입을 선택할 때 단순히 값을 저장가능한 범위만 보고 타입을 선택X
        // 정확한 계산을 해야하는 경우는 정밀도가 더 중요
        // 정밀도가 중요한 경우는 float보다 double


        // print

        // println 단점

        // 1. 출력형식 지정 불가 (실수 자리 조절X = 소수점 n자리만 출력불가)
        System.out.println(10/3); // 3 (정수 나누기 정수라서)
        System.out.println(10.0/3); // 3.3333333..

        // 2. 10진수로만 출력
        System.out.println(0x1A); // 26 (10진수로 변환되서 출력)

        // printf
        // 출력형식 지정 가능
        // 앞에 출력형식을 정해주는 문자열은 지시자
        System.out.printf("%.2f\n", 10.0/3); // 3.33 (소수점 둘째자리)
        System.out.printf("%d\n", 0x1A); // 26 (10진수로 출력)
        System.out.printf("%X\n", 0x1A); // 26 (16진수로 출력)

        // 지시자

        // 정수
        // %b : boolean 형식으로 출력
        // %d : 10진(demical) 정수의 형식으로 출력
        // %o : 8진(octal) 정수의 형식으로 출력
        // %x, %X : 16진(hexa-demical) 정수의 형식으로 출력

        // 실수
        // %f : 부동 소수점(float-point)의 형식으로 출력
        // %e, %E : 지수(exponent) 표현식의 형식으로 출력

        // 문자
        // %c : 문자(character)로 출력
        // %s : 문자열(string)로 출력

        // 지시자는 한번에 여러개 사용가능. 값의 개수도 지시자의 개수만큼 적어줘야함
        // \n(개행문자), %n(os에 관계없이 개행문자) : 줄바꿈 => 가능하면 %n 사용
        System.out.printf("age:%d year:%d\n", 14, 2017);

        // 출력될때 접두사는 안 나옴, 나오게 하려면 지시자에 #
        // 지시자 X를 대문자로 나오면 접두사와 F가 모두 대문자로 나옴
        System.out.printf("%#o", 15); // 017
        System.out.printf("%#x", 15); // 0xf
        System.out.printf("%#X", 15); // 0XF

        float fl = 123.4567890f;
        System.out.printf("%f", fl); // 123.456787 소수점 아래 6자리 (정밀도 7자리, 87은 의미없음)
        // 즉 double로 변경해야함
        System.out.printf("%e", fl); // 1.234568e+02 지수형식 (e+02는 10^2)
        System.out.printf("%g", 123.456789); // 123.457(7자리) 간략한 형식
        System.out.printf("%g", 0.00000001); // 1.00000e-8 간략한 형식

        // 출력결과가 마지막이 9가 아니라 7이 출력되는데 ⇒ 정밀도
        // float의 정밀도는 7자리 ⇒ 앞 7자리까지만 값이 정확. 나머지 두자리는 정확하지않음(의미없는 숫자)
        // float보다 double을 사용하는게 좋음
        // e는 지수형식으로 출력. e+02는 10^2을 의미
        // 지시자 f와 e로 출력했을 때 값이 조금 다름
        // 실제로 저장된 값은 같은데 마지막 값이라서 반올림해서 보여주기 때문
        // 지시자 g는 f처럼 출력해서 보여주고 지수형태로 표현하는게 더 간략하다고 판단되면 지시자e와 같은 형태로 출력함
        // 실수 지시자는 기본적으로 f를 많이 사용하고 숫자에 0이 많이 들어가면 e를 사용

        // println이나 prinf는 객체를 생성하지않고도 사용할 수 있었음

        System.out.printf("[%5d]%n", 10); // [   10]
        System.out.printf("[%-5d]%n", 10); // [10   ] - : 왼쪽정렬
        System.out.printf("[%05d]%n", 10); // [00010]

        // %전체자리.소수점아래자리f
        double da = 1.23456789;
        System.out.printf("d=%14.10f%n", da);//  공백공백1.2345678900
        // 앞 빈자리는 공백, 뒷 빈자리는 0으로 채움

        String url = "www.codechobo.com";
        System.out.printf("[%s]%n", url); // %s 안에 url을 집어넣음
        System.out.printf("[%20s]%n", url); // 공백
        System.out.printf("[%-20s]%n", url); // 왼쪽
        System.out.printf("[%.8s]%n", url); // 부분출력


    }
}