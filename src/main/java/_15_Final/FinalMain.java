package _15_Final;

public class FinalMain {
    public static void main(String[] args) {
        // final 키워드: 반드시 "한번"만 "초기화"되어야 한다.
        // 재대입 x, 초기화가 필수
        final int data1;
        data1 = 10;
        // data1 = 20; 재대입 불가능

        // 참조자료형도 final ok
        final FinalStudent st1 = new FinalStudent("성선혁", 10713, 17);
        st1.printInfo("문성고");

        st1.setAge(18); // ?
        st1.printInfo("문성고");

        // 왜 final 있는데 객체의 상태는 변하는가
        // 객체 final 필드 -> 생성되는 시점에 고정
        // 변수에 저장된 객체주소 final -> 주소만 안바뀌면 ok

        // -> stack에 변수가 저장한 값이 고정되게 하는게 final
        // st1 = new FinalStudent(); 새로운 주소를 대입받는걸 막음

        // final은 재대입을 막는건
        // 1. JVM (x)
        // 2. 컴파일러 (o)

        // 상수선언 가능

        int playerLevel = 18; // 바뀌는 값

        // 18이 무슨 기준이지?
        // -> 매직넘버(모르는 사람이 봤을대 의아한 문자열, 숫자)
        if (playerLevel + 1 > Constant.MAX_LEVEL) { // 최대레벨
            System.out.println("이미 최대레벨에 도달했습니다");
        } else {
            playerLevel++;
        }

        int price = 100000;
        double discountPrice = 0.0; // 최종가격


        // 매직넘버들을 Constant 클래스에 상수화하여
        if(price >= Constant.DISCOUNT_MIN) {
            double discountAmount = price * Constant.DISCOUNT_RATE;
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }

        System.out.println(discountPrice);

    }
}
