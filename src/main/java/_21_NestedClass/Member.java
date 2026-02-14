package _21_NestedClass;

// 중첩 - private에 접근 ok, 좋은설계 x
// 내부클래스 - static 내부클래스(o), 내부클래스(x)
/*
내부클래스 왜 안쓰나?
내부 객체는 반드시 바깥객체가 존재해야 생성가능
-> 내부객체는 항상 바깥객체를 참조하고있다.

JVM에 GC는 참조가 끊어졍 메모리를 회수한다
바깥객체는 더이상 사용되지 않는 허위매물
하지만 내부객체가 어디선가는 사용되는 상황(GC 대상x)
-> 메모리 누수가 됨
 */
public class Member {
    // static 내부 클래스
    // 사실상 서로 다른 클래스 - 유틸리티성격

    private String name;
    private int age;
    private String email;

    // 빌더패턴 - 생성자를 대체하는 패턴
    // 필드가 많은상황 - 오버로딩으로는 안되겠다

    // private로 Member 생성을 막는다
    private Member(Builder builder) {
        // 3. 바깥생성자에서 Builder객체의 필드를 복사
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // Member의 내부클래스임을 명시하려고
    // 접근용 static메서드를 제공
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        // 1. 바깥 클래스의 필드구성이 동일하게 가져간다
        private String name;
        private int age;
        private String email;

        // 4. 바깥클래스의 private 생성자를 호출
        public Member build() {
            // builder 객체인 자기자신을 매개변수로 넘겨준다
            Member m = new Member(this);
            return m;
        }

        // 2. setter들을 정의
        public Builder name(String name) {
            // 여기서 this는 Builder객체를 말함
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }
    }

}
