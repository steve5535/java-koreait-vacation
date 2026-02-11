package _16_Inheritance;

// Car 상속
// 생성자
// 기본생성자, protected 생성자 정의
// fuel은 둘다 100으로 초기화
public class GasCar extends Car {
    private int fuel;

    public GasCar() {
        super();
        System.out.println("가스차 생성자 호출!");
        this.fuel = 100;
    }

    public GasCar(String brand, String model) {
        // super(); // Car();
        super(brand, model); // Car(brand, model);
        this.fuel = 100;
    }

    // overriding - 메서드 오버라이딩
    @Override
    public void drive() {
        System.out.println("가스차의 drive 호출!");
        // 부모가 가진 메서드와 똑같은 메서드
        // 자식객체에서 호출시, 부모의 메서드는 가려진다
    }
}