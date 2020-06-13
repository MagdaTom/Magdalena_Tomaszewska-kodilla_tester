public class Book {


    public static String of(String author, String title) {
        return author + title;

    }

    public static void main(String[] args) {

        String book = Book.of("Hermann Hesse ", "Wilk stepowy");
        System.out.println(book);

    }
}



/* Nie mam pojęcia jak osiągnąć efekt podany w zadaniu tj:
Book book = Book.of("Isaac Asimov", "The Galaxy");
 */
/*TODO Review kdrzazga - Pls create a method similar to line 4:
*   public static Book of(String author, String title)   */