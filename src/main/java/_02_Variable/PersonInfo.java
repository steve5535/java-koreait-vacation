package _02_Variable;

public class PersonInfo {
    public static void main(String[] args) {
        /*
        1. 아래의 데이터를 적절한 자료형 및 변수명으로 저장
        2. 각 변수들을 출력
        이름: 홍길동
        출생연도: 1997
        키: 174.3
        혈액형: B
        학생여부: false
         */

        String name = "홍길동";
        int year = 1997;
        float cm = 174.3F;
        char blood = 'B';
        boolean student = false;

        System.out.println("이름: " + name);
        System.out.println("출생연도: " + year);
        System.out.println("키: " + cm);
        System.out.println("혈액형: " + blood);
        System.out.println("학생: " + student);
    }
}
