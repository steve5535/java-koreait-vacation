package _19_Object;

import java.util.Objects;

public class ObjectStudent {
    private String name;
    private int age;

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
        Object 클래스 - 자바의 모든 클래스의 최상위 부모 클래스
        -> 모든 클래스가 object를 상속받고 있다.
        1. toString()
        2. equals()
        3. hashCode()
     */

    @Override
    public String toString() {
        // 필드정보를 문자열로 표현하는 용도로 사용
        String data = "name=" + this.name + ", age=" + this.age;
        return data;
    }

    @Override
    public boolean equals(Object o) {
        // 모든 참조자료형은 Object로 업캐스팅 ok
        if(o == null || o.getClass() != this.getClass()) {
            return false;
        } // null, 다른클래스는 false

        ObjectStudent that = (ObjectStudent) o; // 다운캐스팅
        boolean isSameAge = that.age == this.age;
        // 참조자료형 비교 - Objects.equals(); 비교 - 재귀
        boolean isSameName = Objects.equals(that.name, this.name);
        return isSameAge && isSameName;
    }

    // equals를 오버라이딩하면, 반드시 hashCode() 오버라이딩 해줘야한다
    @Override
    public int hashCode() { // "중복"처리
        // equals에서 비교한 필드들을 동일하게 hash에 넣어준다
        int result = Objects.hash(name, age);
        return result;
    }

}
