package _04_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 외부로부터 데이터를 입력받을 수 있는 "객체"
        // new 연산 -> 객체를 생성
        // sc는 Scanner라는 참조자료형 변수
        Scanner sc = new Scanner(System.in);


        // 엔터키도 문자
        System.out.print("숫자 입력 >>");
        int myInt = sc.nextInt(); // 숫자까지 잘라서 가져옴
        System.out.println("내가 입력한 숫자: " + myInt);
        sc.nextLine(); // 엔터키를 먹고 사라지는 용도

        System.out.print("문자열 입력 >>");
        String myString = sc.nextLine(); // 엔터키까지 잘라서 가져옴
        System.out.println("내가 입력한 문자열: " + myString);

        sc.close(); // 스캐너를 반납 - 메모리에서 제거
    }
}
