package _13_Access;

public class Library {
    private Book[] books; // 보유 책

    public Library() {
        // 도서관 책 용량
        Book[] books = new Book[3]; // 총 3개 저장가능
        this.books = books;
    }

    public void addBook(Book book) {
        // books의 빈자리 book 추가
        int emptyIndex = getEmptyIdx();
        if(emptyIndex == -1) {
            System.out.println("꽉찼습니다");
            return;
        }

        // 빈자리에 매개변수로 들어온 book
        books[emptyIndex] = book;
        System.out.println("저장완료");
    }

    // books의 빈자리번호 찾는 메서드
    private int getEmptyIdx() {
        // null
        // 참조자료형이 초기화가 안된경우
        // 저장된 주소가 없는걸 표현한 값

        // books를 탐색할때 저장된 주소가x
        // -> 빈자리
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return i;
            }
        }
        // 반복될동안 null 못찾음 -> 꽉찼다
        return -1;
    }

}
