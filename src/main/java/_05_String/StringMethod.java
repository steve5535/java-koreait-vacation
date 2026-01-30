package _05_String;

public class StringMethod {
    public static void main(String[] args) {
        /*
            첫글자 소문자: 기본자료형
            첫글자 대문자: 참조자료형

         */

        String str = "My name is Son";
        // 문자열의 길이 - 문자의 갯수
        int lengthOfStr = str.length();
        // 특정 문자열의 포함여부
        boolean isSon = str.contains("Son");

        // 문자열은 문자들이 이어져있는 구조
        // 순서(index)가 존재
        // 특정 문자열이 어기서(index) 시작하는지?
        int indexOfSon = str.indexOf("Son");

        // 문자열의 일부분을 추출
        // substring(index) - index부터 끝까지 잘라옴
        // substring(index1, index2) - index1이상 index2 미만 잘라오겠다
        String son = str.substring(11);
        String son2 = str.substring(indexOfSon);

        // 아래 email에서 아이디만 추출
        // 조건) 아이디가 바뀌더라고 아이디가 추출되게
        String email = "java@java.net";
        int indexOfAt = email.indexOf("@");
        String id = email.substring(0, indexOfAt);
        System.out.println(id);

        // 참조자료형의 값비교
        // 참조자료형(대문자로 시작하는 타입)은 == 비교 x

        // JVM의 메모리는 stack + heap
        // == 연산은 stack에 있는 값을 비교
        // 참조자료형은 stack에 heap메모리 주소를 저장
        // -> 실제값이 아닌 주소비교가 되버림
        String name1 = "홍길동";
        boolean isSameName = name1.equals("홍길동");
    }
}
