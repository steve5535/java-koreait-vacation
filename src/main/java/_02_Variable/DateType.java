package _02_Variable;

public class DateType {
    public static void main(String[] args) {
        // 자료형이란, 저장된 2진수를 어떨게 해석할지 정의하는 것

        // 1. 정수타입
        byte byteNum = 127; // 1바이트
        short shortNum = 32000; // 2바이트
        int intNum = 21; // 4바이트 - -21억~21억
        long longNum = 3_000_000_000L; // 8바이트

        // 2. 실수타입
        float smallBox = 3.14F; // 4바이트 - 소숫점7자리
        double bigBox = 3.14; // 8바이트 - 소숫점15자리

        // 3. 문자타입 - 글자 1개
        char char1 = 'A'; // 'A' <-> 65
        char char2 = 65 + 1; // 숫자 <-> 문자
        // 숫자 <-> 문자 1:1 대응시킨 표: 아스키 코드표
        System.out.println(char1);

        // 4. 논리타입 - true / false
        // 의문형으로 변수명 작명
        boolean isLogin = true;
        boolean hasMoney = false;

        // 5. 문자열 - 문자 여러개
        String str = "안녕하세요";

        // 자료형의 첫글자가
        // 첫글자가 소문자 -> 기본타입(자료형)
        // 첫글자가 대문자 -> 참조타임(자료형)

    }
}
