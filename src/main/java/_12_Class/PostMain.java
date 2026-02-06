package _12_Class;

public class PostMain {
    public static void main(String[] args) {
        // Post 객체 생성
        Post p1 = new Post(); // 필드값 초기화 x
        // 주소에 직접대입
        p1.title = "페이커 멋있다";
        p1.content = "은퇴 안해도될듯";

        Post p2 = new Post("점멸 빼도 됨?", "명상 넣고 싶은데", "익명", 204);

        p2.printCount();
    }
}
