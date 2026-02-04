package _02_Variable;

public class TypeCasting {
    public static void main(String[] args) {
        // (자료)형변환: 데이터 타입을 다른 타입을 변환

        // 자료형은 최대용량이 존재
        // 큰 -> 작은: 넘칠수도 있음 -> 데이터가 유실가능성o
        // 작은 -> 큰: 넘칠수 없음 -> 데이터 유실 가능성x

        // 작 -> 큰:  자동형변환
        int intVal = 10;
        long lonVal = intVal;
        double doubleVal = intVal;

        // 큰 -> 작: 명시적 형변환
        doubleVal = 1.5;
        intVal = (int)doubleVal;
        System.out.println(intVal); // .5가 사라짐

        // 서로다른 타입끼리 연산시
        // -> 용량이 큰 타입으로 자동형변환
        int kor = 80;
        int eng = 90;
        int math = 90;
        // 3말고 3.0 -> 자동형변환
        double avg = (kor + eng + math) / 3.0;

        // 오버플로우
        long maxIntPlus1 = 2_147_483_648L; // int의 최댓값 + 1
        int overflowInt = (int) maxIntPlus1;
        System.out.println(overflowInt);

        // 문자열 -> 숫자
        String strNum  = "34";
        // 문자열과 숫자를 더하면 -> 숫자가 문자열로 변함
        System.out.println(strNum+1);

        // Integer의 기능을 이용
        int intDate = Integer.parseInt(strNum);
        System.out.println(intDate + 1);

        // 숫자 -> 문자열
        int number = 100;
        String strNumber1 = "" + number;
        String strNumber2 = Integer.toString(number);


    }
}
