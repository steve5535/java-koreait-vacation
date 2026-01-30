package _09_While;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1이상 101미만 정수중에 하나를 랜덤하게 뽑기
        int randomNum = random.nextInt(1, 101);

        // 입력값보다 랜덤값이 크면 "Up" 출력
        // 입력값보다 랜덤값이 작으면 "Down" 출력
        // 같으면 "정답입니다!" 출력하고 탈출

        int myPick = 0;
        // 시행횟수 5를 넘어가면 탈출
        int count = 0; // 시행횟수
        // 탈출조건이 많으면 가독성 x
        while(true) {
            System.out.print("1~100사이 입력 >");
            myPick = scanner.nextInt();
            // 입력값이 1~100사이가 아니라면
            if(myPick < 0 || myPick > 100) {
                System.out.println("1~100을 입력하세요");
                continue; // 다음반복으로 스킵
            }

            count++;
            if(count > 5){
                // count가 6일때
                System.out.println("시행회횟수 초과!");
                break;
            }
            if(myPick == randomNum){
                System.out.println("정답입니다!");
                break; // break -> 가장가까운 반복문 중괄호 탈출
            } else if (myPick > randomNum) {
                System.out.println("Down");
            } else if (myPick < randomNum) {
                System.out.println("Up");
            }
        }
        // 탈출
    }
}
