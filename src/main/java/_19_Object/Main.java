package _19_Object;

public class Main {
    public static void main(String[] args) {
        ObjectStudent st1 = new ObjectStudent("홍길동", 20);
        // println() 매개변수로 객체가 넘어오면
        // 내부에서 객체.toString() 결과를 출력
        System.out.println(st1);

        ObjectStudent st2 = new ObjectStudent("홍길동", 20);
        System.out.println(st1 == st2); // false

        // 기존의 Object의 equals()는 ==을 사용하고 있음
        System.out.println(st1.equals(st2)); // true - equals 오버라이딩

        // 문자열 클래스도 equals()를 오버라이딩 한 것 이었다.
    }
}
