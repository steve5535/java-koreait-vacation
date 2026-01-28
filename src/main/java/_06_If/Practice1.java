package _06_If;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 철수(174cm, 70kg)
        // bmi = 체중(kg) / (키(m)*키(m))
        // bmi 30이상 -> 비만, 25이상~30미만 -> 과체중
        // 18.5이상 25미만 -> 정상, 18.5미만 -> 저체중
        // 철수의 비만도를 출력]

        Scanner scanner = new Scanner(System.in);

        System.out.print("키(cm) >>");
        int height = scanner.nextInt();
        System.out.print("몸무게(kg) >>");
        int weight = scanner.nextInt();

        double bmi = weight / ((height *0.01)*(height *0.01));

        // 아래의 조건문을 입력받은 height / weight
        // 값이 음수가 아닐때 실행되게 만들어 주세요
        // -> 양수일때만 실행되게 만들어 주세요

        if (weight > 0 && height > 0) {
            if (bmi >= 30) {
                System.out.println("비만");
            } else if (bmi >= 25) {
                System.out.println("과체중");
            } else if (bmi >= 18.5) {
                System.out.println("정상");
            } else {
                System.out.println("저체중");
            }
        }else {
            System.out.println("잘못된 입력");


        if (bmi >= 30) {
            System.out.println("비만");
        } else if (bmi >= 25) {
            System.out.println("과체중");
        } else if (bmi >= 18.5) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }
        }
    }
}
