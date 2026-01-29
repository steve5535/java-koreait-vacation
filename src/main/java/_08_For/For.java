package _08_For;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        /*
            for(변수 선언; 조건식; 증감식) {
                // 반복실행될 코드
            }
         */

        // 변수선언: for문안에서 쓸변수를 선언
        // 조건식: false면 탈출
        // 증감식: 변수조작
        // 초기식 -> (조건식 -> 코드실행 -> 증감식)xN -> 조건식이 false일때 탈출
        for(int i = 0; i < 10; i++){
            System.out.println("현재 숫자:" + i);
        }

        int a = 1;
        for(; a < 6; a++){
            System.out.println("현재 a:" + a);
        }
        System.out.println(a);

        // 1단계) 1~10까지 출력 v
        // 2단계) 거기서 짝수만 출력 v
        // 3단계) 1~100까지 합한 값 출력 v
        // 4단계 1~100까지 수 중에 V
        // 3의배수, 5의배수 각각 갯수 출력

        // 1단계
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 2단계
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 3단계
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);

        // 4단계
        int count3 = 0;
        int count5 = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                count3 += 1;
            }
            if (i % 5 == 0) {
                count5 += 1;
            }
        }
        System.out.println("3의 배수 개수 : " + count3);
        System.out.println("5의 배수 개수 : " + count5);



    }
}
