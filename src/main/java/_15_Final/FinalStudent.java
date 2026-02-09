package _15_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // final 필드는 반드시 초기화되는 코드가 존재해야함 ->
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // final필드는 setter 막혀있음
//    public void setName(String name) {
//        this.name = name;
//    }

    // final 매개변수
    public void printInfo(final String schoolName) {
        // schoolName = "자바고등학교";
        // 외부에서 들어온 갑 변경 x
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
