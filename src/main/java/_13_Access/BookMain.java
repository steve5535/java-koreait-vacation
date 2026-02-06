package _13_Access;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("노인과바다", "허밍웨이");
        Book book2 = new Book("인간실격", "다자이 오사무");
        Book book3 = new Book("상실의 시대", "무라카미 하루키");

        Library library = new Library();
        // Library.books에 직접 대입 불가능
        library.addBook(book1); // 구현한 코드로만 대입
        library.addBook(book2);
        library.addBook(book3);
    }
}
