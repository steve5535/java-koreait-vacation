package _13_Access.b;

import _13_Access.a.AccessData;

public class OuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicVal = 1; // ok
        // accessData.defaultVal = 1; // 다른 패키지라서 접근 x
    }
}
