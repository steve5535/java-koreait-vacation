package _16_Inheritance;

// 자식클래스
public class ElectricCar extends Car {
    // 부모의 private필드는 물려받음
    // 다만, 접근이 불가능
    private int battery;

    // 자식의 기본생성자
    // 자식의 생성자 호출시, 부모의 생성자가 가장 처음 호출됨
    public ElectricCar() {
        super(); // 부모생성자 호출
        // super()는 생략가능
        System.out.println("전기차 생성자 호출!");
        this.battery = 100;
    }

    public ElectricCar(String brand, String model) {
        // 제약사항: super()호출은 생성자 호출시 가장 먼저 실행
        super(brand, model);
        this.battery = 100;
    }

    // this != this()
    // super != super()
    public void driveWithBattery() {
        // super.필드: heap영역에서 부모영역만 탐색하겠다
        // super.메서드(): 부모클래스 기준에서 호출하겠다

        // super는 부모로부터 물려받은 필드, 메서드를 지칭
        // this는 super부분을 접근할 수 있음,
        // 단, 이름이 겹치면 x
        super.drive();
        this.drive();
    }

    @Override
    public void drive() {
        System.out.println("전기차 drive 호출!");
    }
}