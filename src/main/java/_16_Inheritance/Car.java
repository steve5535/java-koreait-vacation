package _16_Inheritance;

// 상속 - 부모의 필드, 메서드를 사용가능
// 모든 차가 가져야할 공통적인 필드, 메서드를 정의
// 부모 클래스
public class Car {
    private String parentName;
    // 같은 패키지 && 상속관계
    protected String brand;
    protected String model;

    public Car() {
        System.out.println("Car 기본생성자 호출!");
        this.brand = "기본";
        this.model = "프로토타입";
    }

    // protected 필드 초기화 생성자
    public Car(String brand, String model) {
        System.out.println("부모 생성자 호출!!");
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println("부모의 drive 호출!");
    }
}
