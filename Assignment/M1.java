
class BookInventory{
    String title;
    String author;
    int copiesavailable;
    BookInventory(String title, String author, int copiesavailable){
        this.title = title;
        this.author = author;
        this.copiesavailable = copiesavailable;
    }

    void printDetails(){
        System.out.println(title + " by " + author + " - " + copiesavailable + " copies available");
    }
}

public class M1{
    public static void main(String[] args){
        
        BookInventory[] books = new BookInventory[4];
        books[0] = new BookInventory("Clean Code", "Robert C. Martin", 3);
        books[1] = new BookInventory("Effective Java", "Joshua Bloch", 5);
        books[2] = new BookInventory("Refactoring", "Martin Fowler", 0);
        books[3] = new BookInventory("Design Patterns", "GoF", 2);

        for (BookInventory book : books) {
            book.printDetails();
        }
    }
}