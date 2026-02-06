package _13_Access;

public class Main {
    public static void main(String[] args) {
        Access a1 = new Access("데이타");
        // a1.data == "000"; data가 private이기 때문
        a1.setData(""); // 검증된값만 들어가도록
        a1.setData("000"); // ok

        // WaterBottle 객체 생성
        WaterBottle wb = new WaterBottle(); // 100
        wb.getCurrentWater();
        wb.fill(500);
        wb.getCurrentWater();
        wb.drink(600);
        wb.getCurrentWater();
        // -> 각 객체가 가진 값마다 서로 다르게 동작
        // 객체지향 프로그래밍

        // private라서 호출 불가
        // w1.isPoisitive(100);
    }
}
