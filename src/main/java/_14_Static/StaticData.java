package _14_Static;

public class StaticData {
    // (인스턴스)필드 : 각 객체마다 별도의 저장공간 존재
    private int id;
    public int count;

    // (스태틱)필드 : 클래스에 저장되는 정보
    // -> 모든 인스턴스가 접근 가능하며 공유함
    public static int staticCount = 0;

    public StaticData(int id) {
        this.id = id;
        staticCount++;
        count++;
    }

    // 인스턴스 메서드
    public void increaseCount() {
        // new 이후에 호출되는 메서드 -> this가 존재
        this.count++;
        staticCount++; // 호출될때 이미 static정보는 메모리에 존재
    }

    // 스태틱 메서드
    public static void increaseStatic() {
        // 스태틱은 스태틱만 사용가능하다 -> this가 없음
        staticCount++;
        // this.count++; 필드 참조 불가능
        // increaseStatic(); 인스턴스 메서드 호출 불가능

        // -> 객체가 생성되기 전에(this전에) 이미 메모리에 로드됨
    }
}
