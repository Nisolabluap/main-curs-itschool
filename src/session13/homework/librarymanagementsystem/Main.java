package session13.homework.librarymanagementsystem;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Author author1 = new Author("Author 1", "Nationality 1", "Date of Birth 1");
        Author author2 = new Author("Author 2", "Nationality 2", "Date of Birth 2");

        Book book1 = new Book("Book 1", author1, "Publisher 1", "ISBN 1", 5);
        Book book2 = new Book("Book 2", author2, "Publisher 2", "ISBN 2", 3);

        Member member1 = new Member("Member 1", "Address 1", "Contact Info 1");
        Member member2 = new Member("Member 2", "Address 2", "Contact Info 2");

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        member1.borrowBook(book1);

        System.out.println("All Books in the Library:");
        library.displayAllBooks();

        System.out.println("\nAll Members in the Library:");
        library.displayAllMembers();

        String searchTitle = "Book 2";
        Book foundBook = library.searchBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("\nBook found: " + foundBook.getTitle());
        } else {
            System.out.println("\nBook not found with title: " + searchTitle);
        }

        String searchName = "Member 2";
        Member foundMember = library.searchMemberByName(searchName);
        if (foundMember != null) {
            System.out.println("\nMember found: " + foundMember.getName());
        } else {
            System.out.println("\nMember not found with name: " + searchName);
        }
    }
}