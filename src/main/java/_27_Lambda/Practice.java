package _27_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> names = List.of(
                "홍길동", "김길동", "이순신", "손", "",
                "이재용", "", "을지문덕", "페이커", "쵸비"
        );

        // 이름이 3글자 미만인 이름들만 따로 저장
        List<String> under3Names = new ArrayList<>();
        // 매개변수가 하나면, 매개변수 () 생략가능
        StringChecker is3Name = s -> s.length() < 3;
        for(String name: names) {
            if(is3Name.check(name)) {
                under3Names.add(name);
            }
        }

        // 1. StringChecker를 이용하여서
        // 빈문자열을 제외한 이름들만 trimNames에 추가해주세요
        List<String> trimNames = new ArrayList<>();
        StringChecker notBlank = s -> !s.isBlank();
        for(String name: names) {
            if(notBlank.check(name)) {
                trimNames.add(name);
            }
        }

        // trimNames의 이름들 마지막에 ~"님"으로 수정하여 nims에 추가
        // "홍길동" -> "홍길동님"
        // StingProcessor, 메서드명: process()
        List<String> nims = new ArrayList<>();
        StingProcessor addNims = s -> s + "님";
        for(String name: trimNames) {
            nims.add(addNims.process(name));
        }
        System.out.println(nims);

        List<Person> people = List.of(
                new Person("홍길동", 18),
                new Person("김자바", 22),
                new Person("이파이썬", 30),
                new Person("박스프링", 15)
        );

        // PersonModifier를 사용하여람다로 성인만 찾는 람다식
        List<Person> adults = new ArrayList<>(); // 추가
        PersonModifier<Boolean> adultChecker = p -> p.getAge() >= 20;
        for(Person p: people) {
            if(adultChecker.modify(p)) {
                adults.add(p);
            }
        }

        // PersonModifier 활용
        // people에서 3글자 초과인 사람들만 뽑아서 results에 담아주세요
        List<Person> results = new ArrayList<>();
        PersonModifier<Boolean> longChecker = p -> p.getName().length() > 3;
        for(Person p: people) {
            if(longChecker.modify(p)) {
                results.add(p);
            }
        }

        // 이름의 두번째 글자를 *로 바꿔주는 코드
        List<Person> madkings = new ArrayList<>();
        // <T, R> : T타입받아서 R타입 리턴
        // <Person, Person> : Person타입받아서 Person리턴
        Function<Person, Person> makeMask = p -> {
            // 1. setter 사용
            // 2. new 사용
            String name = p.getName();
            String maskedName = name.charAt(0) + "*" + name.substring(2);
            return new Person(maskedName, p.getAge());
        };

        for(Person p: people) {
            Person maskedPerson = makeMask.apply(p);
            madkings.add(maskedPerson);
        }
        System.out.println(madkings);

        // Function을 이용한 람다식으로
        // people에서 age < 20 객체들의 이름들을 "비공개"로 바꿔주세요
        List<Person> minorMasked = new ArrayList<>(); // 추가
        Function<Person, Person> hideMinor = p -> {
            return new Person("비공개", p.getAge());
        };
        for(Person p: people) {
            if(p.getAge() < 20) {
                minorMasked.add(hideMinor.apply(p));
            }
        }
        System.out.println(minorMasked);

    }
}
