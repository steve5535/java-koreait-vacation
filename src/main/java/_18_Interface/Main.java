package _18_Interface;

public class Main {
    public static void main(String[] args) {
        /*
            상속의 한계
            1. 다중상속이 불가능 - 필드가 겹치면 애매해짐
            2. 자식클래스로 갈수록, 필드가 점점 확장 됨

            인터페이스
            1. 필드 x, 오로지 메서드만(기능만) 조립/조합
            2. 다중이식이 가능!
            => 라이브러리 공부할 때 다시 복습!!
         */

        AnimalManager manager = new AnimalManager();
        Dog dog = new Dog();
        Duck duck = new Duck();

        // Animal타입을 매개변수로 받음
        // 인터페이스 타입으로 변환 -> (사이드)캐스팅
        // 캐스팅되서 넘어간다고 생각해도 ok
        manager.makeSound(dog);
        manager.makeSound(duck);
    }
}
