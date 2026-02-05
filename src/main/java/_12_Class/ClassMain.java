package _12_Class;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스: 내가 직접 정의하는 참조자료형

        // 누구의 점수??
        int[] scores = {80, 90, 70};
        String[] names = {"홍길동", "김둘리", "도우너"};

        // 세트로 묶어서 관리할 자료형 - Student

        // Student자료형 변수를 선언
        Student st1; // main-stack에 st1변수 생성

        // new: 참조자료형 데이터를 저장할 공간 확보
        st1 = new Student(); // st1은 확보한 heap주소를 대입받음

        // 주소.필드명 = 데이터
        // "."을 자바에서는 참조라고 부른다.
        st1.name = "홍길동";
        st1.kor = 90;
        st1.eng = 80;
        st1.math = 70;

        // new해서 실제 heap에 로드된 데이터묶음을 "객체"
        // 혹은 "인스턴스"라고 말한다.

        Student st2 = new Student();
        st2.name = "홍길동";
        st2.kor = 90;
        st2.eng = 80;
        st2.math = 70;

        // 값이 같더라도 st1 != st2
        // 하지만 같은 자료형
        Student[] students = {st1, st2};


        /*
            Car 클래스를 정의해 주세요
            필드: brand(회사명), model(모델명), year(출시년도)
            main에서 Car 객체 하나를 생성하고 초기화(데이터 넣어주세요)
         */
        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2000;
        System.out.println(car1.model); // 저장한 데이터 읽기

        // 초기화
        car1.isEnginOn = false;
        car1.speed = 0;

        Car car2 = new Car();
        car2.model = "x3";
        car2.isEnginOn = false;
        car2.speed = 0;

        // 인스턴스 메서드 호출 -> 객체를 참조하여 호출
        // 객체정보를 메서드로 넘겨준다(보이진 않음)
        car1.enginStart();
        car1.accel();

        car2.enginStart();

        Student st3 = new Student("김길동", 60, 80, 100);
        System.out.println(st3.name); // 직접 주소에 대입하지 x
        System.out.println(st3.math);

        // Car 클래스에 정의해주세요
        // 1. Car 클래스의 모든 필드를 초기화 할 수 있는 생성자
        // 2. Car 클래스의 필드를 하나도 초기화 하지 않는 생성자

    }
}
