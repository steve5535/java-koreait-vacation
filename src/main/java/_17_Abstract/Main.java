package _17_Abstract;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 객체를 생성할 수 없음
        // Character ch1 = new Character();

        // 업캐스팅
        // 실제(new)객체 자식, 변수타입은 부모
        Character warrior1 = new Warrior("킹전사");
        Character warrior2 = new Warrior("짱전사");

        // 컴파일러는 부모클래스에 attack()이 있나? 검사
        // JVM은 new로 생성된 객체의 attack()을 호출
        // 오버라이딩이 강제된다 -> 업캐스팅되더라도 자식메서드를 호출하겠다
        warrior1.attack(warrior2);

        Character mage1 = new Mage("법사");
        Character mage2 = new Mage("법사 연습생");

        // 추상 클래스 상속 -> 오버라이딩 강제
        // 다형성: 같은코드인데 다르게 동작

        // 업캐스팅된 상태로 배열에 저장
        Character[] party = {warrior2, mage1, mage2};
        for(Character ch: party) {
            ch.attack(warrior1);
        }

        mage1.attack(warrior2);

    }
}
