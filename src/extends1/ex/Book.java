package extends1.ex;

public class Book extends Item {

    private final String author;
    private final String isbn;

    // ctrl + alt + G .. 알아서 만들어준다 !
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    // ctrl + O .. 오버라이드 해준다 !
    @Override
    public void print() {
        // super.name .. private이라 접근 불가
        super.print();
        System.out.println("- 저자: " + author);
        System.out.println("- isbn: " + isbn);
    }
}
