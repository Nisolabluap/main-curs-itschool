package session13.homework.librarymanagementsystem;

public class Book {

    private String title;
    private Author author;
    private String publisher;
    private String ISBN;
    private int numberOfCopies;
    private int availableCopies;

    public Book(String title, Author author, String publisher, String ISBN, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
        this.availableCopies = numberOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public void decrementAvailableCopies() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void incrementAvailableCopies() {
        availableCopies++;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author.getName() + "\nPublisher: " + publisher
                + "\nISBN: " + ISBN + "\nNumber of Copies: " + numberOfCopies + "\nAvailable Copies: " + availableCopies;
    }
}