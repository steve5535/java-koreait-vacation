package _09_While;

public class Scope {
    public static void main(String[] args) {
        // 스코프: 변수의 생존 범위
        // 해당 변수가 선언된 중괄호 안쪽으로 생존 가능하다 - java

        int m = 10;
        if(true) {
            int x = 20;
            System.out.println(m); // main 안쪽 -> 생존
        } // 변수 x 생존 종료
        // 컴파일러가 사용을 막는다.
        // System.out.println(x);

        int b = 30;
        {
            System.out.println(b); // ok
        }
        // System.out.println(b); // not ok

        for(int i = 0; i < 10; i++){
            // 변수 i는 for문 중괄호 안에서만 생존
        }
        int i = 20; // for문 i와 별개의 i


    } // 변수 m 생존 불가
}
