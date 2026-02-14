package _20_Enum;

// enum은 Enum이라는 클래스를 상속받고 있음
public enum Grade {
    // public static final Grade BASIC = new Grade(5);
    BASIC(5),
    GOLD(10),
    DIAMOND(20);
    // 항상 최상단에 상수객체들을 생성자 형식으로 나열
    private int discountRate;

    // 생성자 접근제한다가 private만 가능
    Grade(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
