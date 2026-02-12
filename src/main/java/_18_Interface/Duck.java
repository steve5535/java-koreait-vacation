package _18_Interface;

// 3가지를 모두 이식받고,
// 추상메서드들을 모두 구형해 주세요
public class Duck implements Animal, Flyable, Swimmable{
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("훨훨");
    }

    @Override
    public void swim() {
        System.out.println("어푸어푸");
    }
}
