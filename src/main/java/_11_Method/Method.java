package _11_Method;

public class Method {
    // public(접근제한자) - 나중에
    // static - 나중에
    // void - 메서드의 리턴이 없다
    // public static 리턴자료형 메서드명(매개변수1, 매개변수2..) {}
    public static void greeting() {
        System.out.println("greeting 호출됨");
        System.out.println("안녕하세요!");
    } // 메서드 정의: 호출되면 코드를 실행하라

    // 매개변수
    // 함수명(자료형 매개변수1, 자료형 매개변수2...)
    public static void greeting2(String name, int age) {
        System.out.println("안녕하세요 " + name + "입니다");
        System.out.println(age + "살 입니다");
    }

    // 리턴이 있는 경우, 리턴할 데이터의 자료형을 명시
    // 리턴이 없을때는 void
    public static String addNim(String name) {
        String returnDate = name + "님";
        return returnDate;
    }

    // add 메서드 정의
    // 매개변수로 int num1, int num2를 받아서
    // 더한 결과를 리턴
    public static int add(int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {
        // 변수: 데이터를 재사용하려고
        // 메서드: 코드블럭을 재사용하려고

        // 함수호출
        // 정의되어있는 코드가 실행됨
        greeting();

        // 매개변수 있는경우
        // 호출시 매개변수에 데이터를 전달해줘야 한다.
        greeting2("홍길동", 25);

        // return -> 호출결과값
        // 리턴되는 데이터가 값이면 값처럼
        // 객체라면 객체처럼 다룰 수 있다.
        String result = addNim("홍길동");

        System.out.println(add(3, 40));

    }
}
