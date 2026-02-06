package _13_Access;

public class Book {
    private String title;
    private String author;
    // 필드 선언 -> getter, setter, 생성자
    // 보일러플레이트

    // 생성자 및 setter는 언제나 검증뒤에 데이터 업데이트
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
