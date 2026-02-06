package _12_Class;

// 게시글 클래스
public class Post {
    String title; // 제목
    String content; // 게시글
    String author; // 저자
    int viewCount; // 조회수

    // 기본생성자 - 정의된 생성자가 하나도 없으면
    // 컴파일러가 알아서 만들어 줌
    public Post() {}

    // 생성자 - new 연산시 호출
    // static없으면, 객체자신의 주소를 this라는 매개변수로 전달
    // this는 숨겨져있음
    public Post(String title, String content, String author, int viewCount) {
        // this는 자기자신의 heap주소
        this.title = title;
        this.content = content;
        this.author = author;
        this.viewCount = viewCount;
    }

    // 생성자 오버로딩 ok
    public Post(String title, String content) {
        this(title, content, "익명", 0);
        // this() != this 아무런 상관없는 개념
        // this()는 같은 이름의 생성자를 호출(오버로딩됨)

        // 제약사항: 생성자의 가장첫줄에서 호출되어야 함
    }

    // 인스턴스 메서드
    void printCount() {
        // 객체의 필드값을 참조할 수 있다
        // 호출시 매개변수로 this가 넘어온 것
        // this가 숨어있음(생략)
        System.out.println("현재조회수: " + viewCount);
    }
}
