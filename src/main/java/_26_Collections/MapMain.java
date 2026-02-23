package _26_Collections;

import _13_Access.a.InnerMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        // Map - 구현체: HashMap
        // Array, List -> 데이터를 숫자(인덱스)로 관리
        // Map -> 데이터를 Key로 관리
        // Map<Key자료형, Value자료형>
        Map<String, Integer> studentMap = new HashMap<>();

        // 추가 - put
        studentMap.put("김자바", 90);
        studentMap.put("이파이썬", 85);
        studentMap.put("박스프링", 95);

        System.out.println(studentMap);
        /*
            {
                "김자바": 90,
                "아피아썬": 85,
                ...
            }
            -> JSON(데이터를 주고받는형식)과 닮아있다
         */

        // 조회 - get(key)
        System.out.println(studentMap.get("김자바"));

        // 제거 - remove(key)
        studentMap.remove("이파이썬");
        studentMap.remove("어쩌고저쩌고"); // 없는 key라도 에러x

        // 업데이트
        // HashMap의 key는 HashSet으로 구현되어있다
        // -> 중복이 x
        // 나중에 들어온 중복key값의 value가 기존 value값을 덮어쓴다
        studentMap.put("김자바", 100);

        // Map을 for문으로 순회하는 방법
        // key들만 뽑아내서 순회
        Set<String> names = studentMap.keySet();
        for (String name : names) {
            Integer score = studentMap.get(name);
            System.out.println(name + ": " + score);
        }
    }
}
