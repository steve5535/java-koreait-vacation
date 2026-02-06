package _13_Access;

public class Access {
    /*
        접근제어자 - (클래스), 메서드, 필드 모두 동일하게 적용
        데이터 보호목적: 주소로 직접참조(.) 막기위해

        종류
        1. public - 어디서든 . 가능
        2. protected - 같은패키지&&상속관계 일때만 . 가능
        3. default - 같은패키지만 . 가능
        4. private - 클래스 내부가 아니면 .불가능
     */

    // 대부분의 경우 필드는 private
    private String data;

    public Access(String data) {
        this.data = data;
    }

    // setter - set필드이름
    public void setData(String data) {
        // 검증하는 코드
        if (data.isEmpty()) {
            System.out.println("비어있으면 x");
            return;
        }
        if (data.startsWith("박")) {
            System.out.println("박으로 시작하는건 x");
            return;
        }
        this.data = data;
    }

    // getter - get필드이름
    public String getData() {
        return this.data;
    }

}
