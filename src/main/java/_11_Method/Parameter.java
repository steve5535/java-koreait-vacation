package _11_Method;

// 매개변수(Parameter)
public class Parameter {
    // 자바에서는 메서드는 단독으로 존재할 수 없다.
    // 메서드는 클래스에 포함되어 있어야 함

    public static void printInfo(String name) {
        System.out.println("전달받은 이름: " + name);
    }

    // 동일한 메서드 이름으로 정의
    // 컴파일러가 메서드를 구분하는 방법: 메서드 시그니처
    // -> 메서드명 + 매개변수 목록
    // 같은 클래스내에서는 시그니처만 다르면, 동일 이름으로 메서드 정의가능
    // -> 오버로딩
    public static void printInfo(String name, int age) {
        System.out.println("전달받은 이름: " + name);
        System.out.println("전달받은 나이: " + age);
    }

    // 매개변수의 순서가 달라도 서로 다름
    // 시그니처 -> printInfo(1:int, 2:String)
    public static void printInfo(int age, String name) {

    }

//    public  static void printNum(int num) {
//        System.out.println("정수호출!: " + num);
//    }

    public  static void printNum(double num) {
        System.out.println("실수호출!: " + num);
    }

    public static void main(String[] args) {
        // 같은 이름 3개
        // 호출할때 전달하는 데이터 타입에 따라 서로 다른걸 호출
        printInfo("홍길동");
        printInfo("홍길동", 20);
        printInfo(20, "홍길동");

        // 정확히 일치하는 시그니처가 없으면
        // 자동형변환이 가능한 시그니처 메서드를 호출
        printNum(1); // 정수호출!
        printNum(1.0); // 실수호출!

    }
}
