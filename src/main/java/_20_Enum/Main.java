package _20_Enum;

public class Main {
    // 회원등급에 따라 할인율을 차등적용 메서드
    public static double discount(int price, ClassGrade grade) {
        int discountRate = 0;
        if(grade == ClassGrade.BASIC) {
            discountRate = ClassGrade.BASIC.getDiscountRate();
        } else if (grade == ClassGrade.GOLD) {
            discountRate = ClassGrade.GOLD.getDiscountRate();
        } else if (grade == ClassGrade.DIAMOND) {
            discountRate = ClassGrade.DIAMOND.getDiscountRate();
        }

        double discountAmount = price * discountRate / 100.0;
        return price - discountAmount;
    }

    public static void main(String[] args) {
        int price = 10000;
        double result = discount(price, ClassGrade.DIAMOND);
        System.out.println(result);
    }
}
