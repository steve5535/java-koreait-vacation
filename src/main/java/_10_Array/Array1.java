package _10_Array;

public class Array1 {
    public static void main(String[] args) {
        // 배열(Array): 동일한 자료형의 많은 데이터를 한번에 관리하는 자료형
        // 연속된 공간(메모리)에 위치하기 때문에 조회시 유리

        // 배열 생성 방법
        // 1. 자료형[] 변수명 = new 자료형[공간갯수];
        // new -> 참조자료형
        int[] scores1 = new int[5]; // 자리만 만든 상태
        scores1[0] = 90;
        scores1[1] = 80;

        // 2. 초기화까지 한줄
        int[] scores2 = new int[]{90, 80, 40, 60, 100};
        System.out.println(scores2[0]);
        System.out.println(scores2[1]);
        // new생략 버전
        int[] scores3 = {90, 80, 40, 60, 100};

        // 배열의 속성
        // 배열의 칸 갯수(길이) 배열.length
        System.out.println(scores3.length);

        String[] names = {"홍길동", "김길동", "박길동", "이길동", "서길동"};
        // for문으로 전체순회
        for(int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println("이름:" + name);
        }

        // 향상된 for문
        for(String name : names){
            System.out.println("이름: " + name);
            // 인덱스 정보는 숨겨져 있음
            // 인덱스로 데이터에 직접접근하는 코드를 막는다.
        }

        // 향상된 for문을 사용하여
        // scores3의 평균점수를 구해주세요
        // 평균 -> 데이터총합 / 배열이 길이
        double sum = 0.0;
        for(int scores : scores3){
            sum += scores;
        }
        double avg = sum / scores3.length;
        System.out.println("평균점수: " + avg);

        int count = 0;
        for(int scores : scores3){
            if(scores >= avg){
                count++;
            }
        }
        System.out.println("평균이상 점수의 개수: " + count);

        int max = 0;
        for(int scores : scores3){
            // 꺼내온값이 현재 max의 값보다 크면
            // max값 업데이트
            if(scores > max){
                max = scores;
            }
        }
        System.out.println("최고점수: " + max);

        // 기존방법
        int max2 = scores3[0]; // 0번인덱스 값으로 초기화
        for(int i = 1; i < scores3.length; i++){
            if(scores3[i] > max2){
                max2 = scores3[i];
            }
        }

    }
}
