package _17_Abstract.a;

public class Kakao extends Payment {
    public Kakao() {
        super("카카오페이");
    }

    @Override
    public double pay(int price) {
        // 15000원 이상이면 5% 할인
        if(price >= 15000) {
            return price * 0.95;
        } else {
            return price;
        }
    }
}
