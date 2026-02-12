package _17_Abstract.a;

public abstract class Payment {
    private String name; // 결제수단 이름
    public abstract double pay(int price);

    public Payment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
