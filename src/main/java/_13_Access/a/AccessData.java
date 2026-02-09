package _13_Access.a;

public class AccessData {
    public int publicVal;
    int defaultVal; // 생략시 디폴트
    private int privateVal; // AccessData 중괄호 밖에서는 접근x

    public void inner(int data) {
        // 클래스 밖에서는 접근이x
        // public 메서드로 간접적으로 접근하게 만들어 줌
        this.privateVal = data;
    }
}
