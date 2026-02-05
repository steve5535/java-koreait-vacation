package _12_Class;

// 클래스(자료형) 정의
public class Student { // Student 클래스 시작
    // 필드(값), 멤버(변수), 속성
    String name;
    int kor;
    int eng;
    int math;

    // 생성자 - new할때 호출되는 메서드
    // 엄밀히 말하면 메서드 아님
    // 리턴명시 x, 클래스이름과 동일해야함
    public Student() {}

    // 생성자 오버로딩 ok
    public Student(String name, int kor, int eng, int math) {
        // new 연산시 호출됨
        // 매개변수로 초기화할 데이터를 받아올 수 있음
        System.out.println("생성자 호출되었습니다!");
        if (kor < 0 || eng < 0 || math < 0) {
            System.out.println("점수가 음수라니?");
            return;
        }
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        // this는 객체 자신의 heap 주소값
        // 보이진 않지만, 객체를 참조하여 호출하는 생성자, 메서드는 객체 자기자신의 주소를 this라는 매개변수에 전달
    }

} // 끝
