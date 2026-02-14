package _20_Enum;

public class ClassGrade {
    /*
        상수의 한계점
        매개변수로 념겨줄 때 상수사용을 강제할 수 없음
        1. 상수사용을 문법적으로 강제할 수 있을까?
        2. 컴파일 할때 미리 검증할 수 있을까?
            -> 문자열, 숫자대신에 객체를 상수처럼 쓰면 된다
    */
    // Enum을 직접구현하자 - 상수 업그레이드 버전

    private int discountRate; // 할인율

    public static final ClassGrade BASIC = new ClassGrade(5);
    public static final ClassGrade GOLD = new ClassGrade(10);
    public static final ClassGrade DIAMOND = new ClassGrade(20);

    // 생성자 - 외부에서 생성하는걸 막음
    private ClassGrade(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

}
