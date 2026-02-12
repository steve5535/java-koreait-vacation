package _17_Abstract.a;

public class Main {
    public static void paying(Payment payment, int price) {
        System.out.println("결제 시스템을 초기화합니다");
        System.out.println("선택하신 결제: " + payment.getName());
        double finalPrice = payment.pay(price);
        System.out.println("최종금액: " + finalPrice);
    }

    public static void main(String[] args) {
        Payment kakao = new Kakao();
        paying(kakao, 20000);

        // SOLID 원칙 - 객체지향 설계원칙
        // 참고) 개방폐쇄원칙 OCP
        // 개방 폐쇄의 원칙(OCP)이란 기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계가 되어야 한다는 원칙을 말한다.
        // 보통은 OCP를 확장에 대해서는 개방적(open)이고, 수정에 대해서는 폐쇄적(closed)이어야 한다는 의미로 정의한다.
        // 여기서 확장이란 새로운 기능이 추가됨을 의미한다.
        Payment toss = new Toss();
        paying(toss, 20000);
    }
}
