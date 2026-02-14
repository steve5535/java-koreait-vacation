package _21_NestedClass;

import _17_Abstract.Character;

public class Main {
    public static void main(String[] args) {
        // 추상체(추상클래스, 인터페이스)
        // -> 해당타입으로 인스턴스 생성이 불가능

        // 익명클래스 - 한번쓰고 버릴 클래스
        // Character를 상속받는 익명 객체(정의와 동시 생성)
        // 항상 업캐스팅 상태로만 사용가능!
        Character ch = new Character("운영자", 999, 99) {
            // 정의와 동시에 생성
            @Override
            public void attack(Character target) {
                System.out.println("운영자공격");
            }
        };

        System.out.println("익명클래스의 이름은?");
        System.out.println(ch.getClass().getName()); // 익명

        // "HI" 인터페이스 정의, void hello(); - 안녕하세요 출력
        // main에서 익명객체를 생성하여 hello()호출!

        Hi hi = new Hi() {
            @Override
            public void hello() {
                System.out.println("안녕하세요");
            }
        };
        hi.hello();

        // 람다를 사용할때 인터페이스타입의 익명객체를 사용

        Member member = Member.builder() // new Builder()
                .name("홍길동")
                .age(20)
                .email("java@java.com")
                .build(); // Member의 생성자 호출

        LombokClient lc = LombokClient.builder()
                .ip("192.167.1.1")
                .name("성선혁의 휴대폰")
                .deviceName("iPhone15")
                .build();

        System.out.println(lc);
    }
}
