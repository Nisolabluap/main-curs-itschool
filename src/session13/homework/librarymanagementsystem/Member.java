package session13.homework.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private String address;
    private String contactInfo;
    private List<Book> borrowedBooks;

    public Member(String name, String address, String contactInfo) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.decrementAvailableCopies();
        } else {
            System.out.println("The book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.incrementAvailableCopies();
        } else {
            System.out.println("You have not borrowed this book.");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nContact Info: " + contactInfo;
    }
}
