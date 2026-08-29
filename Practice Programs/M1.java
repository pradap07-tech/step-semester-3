class LibraryBook{
    String title;
    String isbn;
    LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    LibraryBook(String title) {
        this(title, "PENDING");
    }
    void printDetails(){
        System.out.println(title + " | " + isbn + " | " + "Catalogued: " + (isbn.equals("PENDING") ? "False" : "True"));
    }
}
public class M1 {
    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};
        for (int i = 0; i < titles.length; i++) {
            LibraryBook book;
            if (isbns[i].isEmpty()) {
                book = new LibraryBook(titles[i]);
            } else {
                book = new LibraryBook(titles[i], isbns[i]);
            }
            book.printDetails();
        }
    }
}
