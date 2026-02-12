package _18_Interface;

// 인터페이스
public interface Animal {
    // 필드선언 x -> Heap이 없다
    // 상수만 선언 가능 -> static은 Heap아님
    // String test = "포유류";

    // 추상메서드만 정의
    // 모든 메서드는 자동으로 public abstract 됨
    void sound();
    void move();
}
