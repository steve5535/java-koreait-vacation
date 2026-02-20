package _24_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        // 자바의 예외 - Error(예측x) > Exception(사전정의되어있음)
        // 비정상적인 여러 상황들을 클래스로 정의해 놓았음

        int a = 10;
        int b = 0;
        System.out.println("나누기 연산 실행합니다!");
        // int result = a / b; // 사전정의된 예외 상황
        // 자동으로 예외객체를 생성
        // JVM은 예외객체를 감지하고, 코드진행을 즉시 멈춤
        System.out.println("현재 14번 라인입니다!");

        // 예외상황을 미리 알고, 처리할 수 있음
        try {
            // 예외가 일어날 가능성이 있는 코드
            int result = a / b;
            // JVM이 예외객체를 들고, 해당 타입예외를 잡아줄 catch를 찾으러감
            System.out.println("저는 실행될까요?");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        } catch (Exception e) {
            // Exception 타입은 모든 예외클래스의 부모 클래스
            // 여러 catch문 작성 가능
            // 구체적인 자식에외 클래스부터 차례대로 작성하는게 좋다
        } finally {
            // 예외가 발생하건, 안하건 언제나 실행되는 구문
            System.out.println("저는 항상 실행됩니다");
        }

        String[] colors = {"pink", "red", "black", "white", "blue"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("색상을 골라주세요(0~4) >");
        try {
            int pinkNum = scanner.nextInt();
            String pickColor = colors[pinkNum];
            System.out.println("고르신 생상: " + pickColor);
        } catch (IndexOutOfBoundsException e) {
            // JVM이 들고다니던 예외객체를 e 매개변수에 대입해줌
            System.out.println("없는 번호입니다");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요");
        } catch (Exception e) {
            System.out.println("뭘입력하신건가요?");
        } finally {
            scanner.close();
        }
    }
}
