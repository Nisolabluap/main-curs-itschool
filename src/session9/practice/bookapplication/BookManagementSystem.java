package session9.practice.bookapplication;

public class BookManagementSystem {

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 200.5f);
        book.printBookInfo();

        Book book1 = new Book();
        book1.printBookInfo();
        book.setTitle("Lotr");
        book.setPrice(100.23f);
        book.printBookInfo();
    }
}