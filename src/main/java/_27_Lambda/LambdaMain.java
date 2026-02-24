package _27_Lambda;

public class LambdaMain {
    public static void printResult(int n1, int n2, Calculator calculator) {
        int result = calculator.calculator(n1, n2);
        System.out.println("연산결과: " + result);
    }

    public static void main(String[] args) {
        /*
            함수형 프로그래밍이 필요하다
            메서드를 객체(값)처럼 다루고 싶다
            - 매개변수로 메서드를 전달하고 싶다
            - 리턴으로 메서드를 리턴하고 싶다

            -> 메서드 하나만 가지는 객체를 만들자
            -> 익명클래스(한번 쓰고 버리는 클래스)
         */

        // add는 익명클래스의 객체 - 캐스팅되어있음
        Calculator add = new Calculator() {
            @Override
            public int calculator(int a, int b) {
                return a + b;
            }
        };

        Calculator multi = new Calculator() {
            @Override
            public int calculator(int a, int b) {
                return a * b;
            }
        };

        // 메서드를 넘겨주는 것처럼 보이고 싶다
        printResult(10, 5, add);

        // 어차피 메서드 하나만 가지고 있으니까
        // 1. 메서드 이름 필요없음
        // 2. 매개변수 타입 필요없음
        // 3. 한줄 리턴이 가능하면 {} 및 return 생략
        Calculator add2 = (a, b) -> a + b; // 람다식
        // multi2를 람다식으로 정의
        Calculator multi2 = (a, b) -> a * b;

        printResult(10, 5, (a, b) -> a + b);
        // printResult에 인라인으로 두 수를 곱하는 람다식을 넘겨주세요
        printResult(10, 5, (a, b) -> a * b);

    }
}
