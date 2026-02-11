package _16_Inheritance;

public class Main {
    public static void main(String[] args) {
        // 자식의 기본생성자 호출
        ElectricCar eCar = new ElectricCar();
        GasCar gCar = new GasCar();

        // 오버라이딩 확인
        eCar.drive();
        gCar.drive();
        // 오버라이딩을 강제하면?
        // 특정클래스를 상속받은 클래스 객체는 항상 해당 메서드를 가진다
        // -> 호출이 안전하게 보장받는다

        // 캐스팅 - 타입을 변경하는 것
        // 1. 업캐스팅: 자식클래스 객체 -> 부모클래스 타입으로 보겠다
        // 2. 다운캐스팅: 부모클래스 객체 -> 자식클래스 타입으로 보겠다

        ElectricCar eCar2 = new ElectricCar();
        eCar2.driveWithBattery(); // 전기차만 가능
        Car car1 = (Car) eCar2; // 업캐스팅
        // car1.driveWithBattery(); 업캐스팅되서 전기차만의 기능상실

        // 생성은 자식객체, 변수 타입은 부모타입 - 업캐스팅
        Car car2 = new GasCar();

        // Car타입을 자식타입인 GasCar로 변환 - 다운캐스팅
        GasCar gasCar = (GasCar) car2;
        GasCar gasCar2 = (GasCar) car1; // 전기차출신

        // 다운캐스팅은 위험하다
        // instanceof 연산자
        // 객체 instanceof 클래스
        // instanceof 기준으로 왼쪽객체가 오른쪽 타입정보를 가지고 있는가?
        System.out.println(car1 instanceof ElectricCar);
        System.out.println(car1 instanceof GasCar);
        System.out.println(car1 instanceof Car);

        // 조건문 + instanceof - 안전한 다운캐스팅
        if (car1 instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) car1;
        } else if (car1 instanceof GasCar) {
            GasCar gasCar1 = (GasCar) car1;
        }

        // Car타입인데, 메서드호출은 자식 객체 메서드 호출됨
        // JVM은 실제객체 기준으로 호출
        car1.drive();
        car2.drive();

    }
}
