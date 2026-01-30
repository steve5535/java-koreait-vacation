package _09_While;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 문자열 ""
        String ex = "";
        // isEmpty -> 빈문자열("") 검사
        // isBlank -> 빈문자열 및 스페이스바, 엔터 공백 검사

        Scanner scanner = new Scanner(System.in);
        String password = "1q2w3e4r";

        // 비밀번호를 입력받아 주세요(맞추면 탈출)
        // 비밀번호를 틀리면 다시 입력 받게(시도횟수 ++)
        // 최대 5회 시도가능, 5회에 도달하면 "계정락" 탈출
        // 입력이 비어있으면, "다시입력하세요" (시도횟수 증가x)


        int count = 1;
        while(true) {
            System.out.print("비밀번호를 입력해주세요 >");
            String inputPassword = scanner.nextLine();
            System.out.println("시도 횟수: " + count);
            if(inputPassword.equals(password)){
                System.out.println("로그인성공!!");
                break;
            }
            if(inputPassword.isEmpty() || inputPassword.isBlank()) {
                System.out.println("다시입력하세요");
                continue;
            }
            count++;

            if(count > 5) {
                System.out.println("계정락");
                break;
            }
        }
    }
}
