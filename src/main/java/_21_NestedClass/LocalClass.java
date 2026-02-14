package _21_NestedClass;

public class LocalClass {
    // 지역클래스
    private int a;
    private int b;

    public void printTotal(int num1, int num2) {

        // 지역클래스
        class Calculator {
            int add(int x, int y) {
                // 바깥클래스의 private 필드에 접근가능
                System.out.println(a);
                System.out.println(b);
                return x + y;
            }
        }

        // 지역클래스 객체 생성은 메서드 내부에서만 가능
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("계산결과: " + result);
    }

    // 1. 중첩 -> private 필드에 접근할 수 있다.
    // 2. 메서드 안에서 또다른 메서드를 정의해서 쓰고 싶다
    // -> 자바는 메서드 단독존재 x, class를 껍데기처럼 사용
    // 람다문법(jdk 8) 이후로 x
}
