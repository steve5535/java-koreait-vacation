package _02_Variable;

public class Variable {
    public static void main(String[] args) {
        // 변수선언 - 좌료형 변수명
        // ram 메모리주소를 할당 - JVM이 알아서

        /*
            변수 명명법
            1. 필수규칙
            String 1name 숫자로 시작 x
            String my name 공백을 포함할 수 x
            String class 예약어 사용 x
            2. 관례(국룰)
            파스칼표기 - LastName - 클래스명, 파일명
            카멜표기 - lastName - 변수명, 메서드명
            3. 매너 - 의미없는 변수명 사용하지 말자
         */

        String greeting;

        // 초기화
        greeting = "hello";

        // 한번에 선언 가능
        String academy = "코리아아이티";

        // 재대입 ok
        academy = "아이티코리아";
    }
}
