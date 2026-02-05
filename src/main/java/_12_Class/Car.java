package _12_Class;

public class Car {
    String brand;
    String model;
    int year;

    // 항상 변할 수 있다고 가정
    int speed;
    boolean isEnginOn;

    // (인스턴스) 메서드 - static이 없으면
    // 객체의 필드값을 메서드 내에서 사용가능/조작 ok
    void enginStart() {
        isEnginOn = true;
        System.out.println(model + "엔진 on!");
    }

    // 객체의 필드값에 따라 다르게 작동하게 할 수 있음
    void accel() {
        if (!isEnginOn) {
            System.out.println("시동을 먼저 켜주세요");
            return;
        }
        speed += 20;
        System.out.println("현재 속도: " + speed);
    }

    // 기본생산자
    public Car(){}


    public Car(String brand, String model, int year, int speed, boolean isEnginOn){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.isEnginOn = isEnginOn;
    }

}
