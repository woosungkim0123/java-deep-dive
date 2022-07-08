public class HelloWorld {
    public static void main(String[] args) {
        // 자바 전 사람이 메모리 직접 메모리 관리 => 메모리 사용 후 반환 하지않아서 메모리 부족 프로그램 사망
        // 자바는 가비지 컬렉터(GC) => 메모리 자동 정리 해줌
        // 멀티 스레드 지원
        // 하나의 프로그램에서 동시에 여러작업가능 
        // 채팅하면서 채팅하는 사람과 파일을 주고 받을 수 있음 => 멀티 스레드 프로그램이 작성되어있어서 가능
        // 요즘 대부분 언어에서 지원
        // 운영체제에 독립적 => c는 종속, python 독립
        // 가능한 이유 => 자바 가상머신때문(jvm)
        // vm : 가상컴퓨터, 실제 컴퓨터가 아니라 소프트웨어로 만들어진 컴퓨터
        // 자바프로그램이 실행되는 가상 컴퓨터(jvm)
        // 일반 어플리케이션은 os(운영체제)에서 실행되는 java프로그램은 jvm위에서 실행된다. os와 독립적일 수 있음
        // 자바는 여러 운영체제별로 jvm이 만들어져있기때문에 하나로 작성된 자바로 수정없이 실행가능



        // 패키지라는 것은 서로 관련된 클래스들을 모아둔 것

        // javac 자바파일 => 컴파일
        // 환경변수를 설정하면 컴퓨터가 실행파일찾을때 현재 디렉토리에 없으면 여기에 등록된 제일 위에 경로부터 
        // 순서대로 찾음
        // 환경변수없으면 c:/javac위치/javac 클래스명.java
        // hello.class파일이 생성된것을 알 수 있음 =? 컴파일러인 javac가 hello.java를 읽어서 jvm알아들을 수 있는
        // 기계어로 변환한것
        // type Hello.class해보면 사람이알아볼수 없는 언어로 된걸 알 수 있음 => 이런 파일을 바이너리파일 or 이진파일
        // 이라고함
        // hello.java와 같이 사람이 알아볼 수 있는 파일을 텍스트파일이라고함
        //실행하려면 java Hello(class이름)
        // 실행할때는 확장자를 붙이지않음
        System.out.println("Hello world");
        // 변수 : 하나의 값을 저장할 수 있는 메모리 공간(RAM)

        // 값을 저장하려면 변수를 선언해야함
        // 변수 선언 이유 : 값(data)을 저장할 공간을 마련하기 위해서
        // 변수선언방벙
        int age; // 실행되면 age라는 이름의 저장공간이 마련됨
        // 정수 :  integer
        age = 25;
        // 한문장 int age = 25;
        // 선언된 변수에 처음으로 값을 저장하는 것을 변수 초기화
        // 모든 변수는 사용하기전 적절한 값으로 초기화 하는 것이 좋음
        // 대부분 변수 선언과 동시에 초기화하는 것이 일반적
        int x = 3;
        int y = 4;
        // 변수 타입이 같은 경우 ,를 사용해서 한줄에 여러변수를 선언할 수 있음
        // int x = 3,y = 4;
        // 메모리는 여러프로그램이 함께 공유하는 자원이라 사용하기전 새로운 값을 저장함으로써 기존의 저장되어
        // 있는 알 수 없는 값을 지우는게 바로 초기화

        // 변수 종류
        // 클래스 변수
        // 인스턴스 변수
        // 지역 변수
        // 주의 : 다른 변수들과 달리 지역변수는 0으로 자동 초기화 되지않기 때문에 값을 읽기전에 반드시 초기화해줘야한다

        final int score = 100;
        // score = 200; 에러 발생
        System.out.println(score);

        boolean power = true;
        char ch = 'A';
        String str = "ABC";
        // byte와 short 타입의 리터럴은 없기때문에 byte타입의 변수에 값을저장할 때는 integer type의 리터럴을 사용
        int i = 100; // 10진수
        int oct = 0100; // 8진수 => 접두사 0이 붙으면
        int hex = 0x100; // 0x가 붙으면 16진수
        int bin = 0b0101; // 접두 0b가 붙으면 2진수
        // 대소문자 구별안함

    }
}
