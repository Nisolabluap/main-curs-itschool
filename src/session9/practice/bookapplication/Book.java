package session9.practice.bookapplication;

public class Book {

    private String title;
    //    private List<Author> authors;
//    private String genre;
//    private String ISBN;
//    private String bookPublisher;
//    private int numberPage;
//    private int shelfLocation;
//    private int stock;
//    private float discount;
    private float price;

    //    private LocalDate publishedDate;
    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(String title, float price) {
        this.title = title;
        this.price = price;
    }

    void printBookInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book price: " + price);
    }
}