package _18_Interface;

// extends 대신 implements
// 다중이식 가능
public class Dog implements Animal, Swimmable {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 질주합니다");
    }

    @Override
    public void swim() {
        System.out.println("강아지가 어푸어푸");
    }
}
