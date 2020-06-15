public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


    public static Book of(String author, String title) {
        return new Book(author, title);
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Book book = Book.of("Hermann Hesse ", "Wilk stepowy");

        System.out.println(book);

    }
}