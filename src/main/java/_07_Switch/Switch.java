package _07_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // switch문은 변수가 가진 값에 따라 분기

        int rank = 2;
        switch(rank) {
            // 해당되는 case로 코드진행이 이동
            case 1:
                System.out.println("1등");
                // switch문 안에서 break읽으면
                // 가장가까운 switch 중괄호 탈출
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default: // 매칭되는 값이 없을 때
                System.out.println("참여상");
                break;
        }

        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
        }

        // 연습) 요일별로 할인율이 다른경우
        Scanner scanner = new Scanner(System.in);
        System.out.print("오늘은 무슨요일? >");
        String dayOfWeek = scanner.nextLine();

        // 월 -> 월요일, 화 -> 화요일...
        // 문자열.trim() - 문자열 좌우공백 제거
        dayOfWeek = dayOfWeek.trim();
        dayOfWeek = dayOfWeek.endsWith("요일")
                ? dayOfWeek
                : dayOfWeek + "요일";

        int price = 10000;
        int discountRate;
        // switch로 각 요일마다 다르게 초기화
        // 월-10, 화/수/목-5, 금-20, 토/일-15, 그외-0

        switch(dayOfWeek){
            case "월요일":
                discountRate = 10;
                break;
            case "화요일": case "수요일": case "목요일":
                discountRate = 5;
                break;
            case "금요일":
                discountRate = 20;
                break;
            case "토요일": case "일요일":
                discountRate = 15;
                break;
            default:
                discountRate = 0;
                break;
        }

        //할인금액
        double discountPrice = price * discountRate / 100.0;
        // 최종금액
        double finalPrice = price - discountPrice;
        System.out.println("최종금액: " + finalPrice);

    }
}
