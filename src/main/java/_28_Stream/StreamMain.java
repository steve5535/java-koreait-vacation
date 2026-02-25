package _28_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        // Stream 클래스 - 배열, 리스트... 가공
        // 1. 중간단계일지라고 원본을 변경하지 x
        // 2. 자기자신을 리턴함 - 파이프라인 구조(체이닝)

        List<String> names = Arrays.asList(
                "김자바", "이파이썬", "박스프링",
                "최코틀린", "김자바", "정리액트"
        );

        // 스트링을 생성하는 2가지 경로
        // 1. 컬렉션.stream()
        // 2. Arrays.stream()
        names.stream() // Stream<String>으로 변환됨
                // forEach(): 매개변수로 Consumer를 받음
                // 람다식으로 Consumer타입 익명객체를 전달
                .forEach(name -> System.out.println(name));

        // forEach같은 메서드들을 stream 연산이라고함
        // 1. 중간연산: 체이닝 가능
        // 1-1. filter(Predicate<T> p)
        // 리턴결과가 true인 데이터만 남김
        List<String> kims = names.stream()
                .filter(name -> name.startsWith("김")) // 중간연산
                .toList(); // 최종연산

        // 1-2. map(Function<T, R> f)
        List<Integer> lenOfNames = names.stream()
                .map(name -> name.length()) // 중간연산
                .filter(len -> len > 3)
                .toList(); // 최종연산은 1회만 가능

        // map과 filter를 사용하여서
        // 이름이 3글자 초과인 이름들만 필터링
        // 이름 뒤에 ~"님"을 붙혀주세요
        List<String> consumer = names.stream()
                .filter(name -> name.length() > 3)
                .map(nimName -> nimName + "님")
                .toList();


        // 2. 최종연산: 체이닝 x - stream을 소모한다.
        // 2-1. forEach(Consumer<T> c)
        consumer.stream()
                .forEach(c -> System.out.println(c));

        // 2-2. collect(Collector<T, A, R> c)
        // 내부적으로 여러 함수형인터페이스를 조합 - 복잡함
        // 자바 17 이상이면 toList(), toSet()
        List<Integer> lenOfNames2 = names.stream()
                .filter(name -> !(name.length() == 4))
                .map(name -> name.length())
                .collect(Collectors.toList()); // 자바 8 기준

        // 1. 홀수만 골라서, 제곱한 결과를 출력해주세요
        List<Integer> nums = Arrays.asList(1,2,4,10,15,20);
        nums.stream()
                .filter(num -> !(num % 2 == 0))
                .map(num -> num * num)
                .forEach(num -> System.out.println(num));

        // 2. names를 List<Person>으로 변환해주세요
        // iskim필드를 김씨면 true, 아니면 false로 지정하여 생성

        // String -> Person - map사용
        List<Person> people = names.stream()
                .map(name -> new Person(name, name.startsWith("김")))
                .toList();
        System.out.println(people);

        // 참고) 2-3. reduce() - 누적합
        // reduce(초기값, (누적변수, 리스트에서 꺼낸변수) -> 연산식)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int total = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);
        System.out.println(total);

        // 참조))) [[1,2],[3,4][5,6]] - 평탄화
        // -> [1,2,3,4,5,6]
        List<List<Integer>> lists = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5,6)
        );
        List<Integer> result = lists.stream()
                .reduce(new ArrayList<>(), (acc, list) -> {
                    List<Integer> newList = new ArrayList<>(acc); // 누적값 복사
                    newList.addAll(list); // 하나씩 가져온 리스트안에 요소를 누적값에 넣기
                    return newList;
                });
    }
}
