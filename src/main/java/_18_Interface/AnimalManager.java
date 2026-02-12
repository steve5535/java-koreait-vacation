package _18_Interface;

public class AnimalManager {

    // 의존성: a가 없으면 동작이 불가능할때 a를 의존한다라고 표현
    // AnimalManager -> [Animal] 의존
    // Dog -> [Animal] 의존
    // 구체적인 클래스끼리 의존하는게 아니라
    // 인터페이스를 통해서 작동
    // Dog -> [Animal] <- AnimalManger
    // DIP 원칙 - 의존성역전원칙

    public void makeSound(Animal animal) {
        System.out.println("조련사가 동물을 울게 만듭니다");
        animal.sound();
    }
    public void makeFly(Flyable flyable) {
        System.out.println("조련사가 동물을 날게 만듭니다");
        flyable.fly();
    }
    public void makeSwim(Swimmable swimmable) {
        System.out.println("조련사가 동물을 헤엄치게 합니다");
        swimmable.swim();
    }
}
