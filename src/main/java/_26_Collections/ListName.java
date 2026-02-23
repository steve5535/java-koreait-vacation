package _26_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 컬렉션 자료구조 - 데이터를 저장하는 자료형
// List, Map, Set - 3개 모두 다 인터페이스, 구현체는 여러개 존재
public class ListName {
    public static void main(String[] args) {
        // 배열을 필드로 가지고 있음
        // 배열이 꽉차면, 점점 늘려가면서 확장
        List<String> fruits = new ArrayList<>();

        // C(추가)R(읽기)U(수정)D(삭제)

        // 추가 - add() // 맨 뒷자리에 데이터 추가
        fruits.add("사과");
        fruits.add("오렌지");

        fruits.add(1, "망고"); // index 지정

        // 읽기 - get(index)
        System.out.println(fruits.get(1));
        System.out.println(fruits.size()); // 길이를 리턴하는 getter

        // 수정 - set(index, 데이터)
        fruits.set(0, "키위");

        // 제거 - remove()
        fruits.remove(1); // 인덱스 데이터 삭제
        fruits.remove("키위"); // 매칭되는 데이터 삭제

        // 포함여부 - contains(데이터)
        System.out.println(fruits.contains("키위"));

        Scanner scanner = new Scanner(System.in);
        // todoList라는 변수로 String을 저장하는 ArrayList 만들어주세요
        List<String> todoList = new ArrayList<>();

        System.out.print("todo 몇개 입력? > ");
        int count = scanner.nextInt();
        scanner.nextLine(); // 엔터처리

        // 1. 반복문을 돌면서 입력한 count만큼 todo를 입력받고, 추가
        for(int i = 0; i < count; i++) {
            System.out.print("할일 입력 > ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        // 2. 반복문을 돌면서 todoList 전체 출력!
        for(String todo : todoList) {
            System.out.println("할일: " + todo);
        }

        scanner.close();
    }
}
