package _13_Access.a;

public class InnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicVal = 1;
        accessData.defaultVal = 2; // 같은 a패키지라서

        // private 접근하려면 열려있는 메서드로 접근해야 함
        accessData.inner(3);
        // JVM은 접근제한자 영향을 x
        // 컴파일러가 접근제한을 하는 것
        // 컴파일러가 접근 제한 주도권을 가지고 있다
    }
}
