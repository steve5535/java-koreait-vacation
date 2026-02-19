package _22_Wrapper;

public class Main {
    public static void main(String[] args) {
        /*
            원시자료형의 단점 - 객체가 아님
            1. 메서드를 가질 수 없다
            2. null값을 가질 수 없다
            int[] scores = {80, 90, 30, 0, 50}
            0점이 실제 0점인지, 초기값인지 알수가 없다.
         */

        // 원시자료형을 감싸는 클래스 - wrapper 클래스(java.lang패키지)
        // Integer - int를 감싸는 래퍼클래스
        Integer integer1 = Integer.valueOf(90);
        Integer integer2 = 90; // 자동으로 컴파일러가 알아서 변환

        // Long - long을 감싸는 래퍼클래스
        Long long1 = 100L; // 바로 대입하는 것을 오토박싱이라고 한다.
        // double -> Double 클래스
        // boolean -> Boolean 클래스

        // 박싱한 이후에는 == 비교 불가능
        // .equals()로 비교해야 한다
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);

        // -128 ~ 127 Integer객체는 캐싱되어 있다.
        // -> Integer는 미리 256개의 객체를 만들어 놓고,
        // 필요하면 해당 객체를 리턴한다
        System.out.println("a==b :" + (a == b));
        System.out.println("a와 b가 값이 같나요? " + (a.equals(b)));

        // 래퍼타입 -> 원시자료형(언박싱)
        int int1 = a.intValue();

        // 미리 정의되어있는 유틸 메서드
        Integer.max(10, 20); // 큰값 리턴
        Integer.min(10, 20); // 작은값 리턴
        Integer.sum(10, 20); // 합한값 리턴

        // 문자열 -> 정수타입 변환
        Integer.parseInt("100"); // int리턴
        Integer.valueOf("100"); // Integer리턴

    }
}
