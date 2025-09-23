import book.Book;
import library.Library;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        Library lib2 = new Library();
        lib2.addBook(book3);
        lib2.addBook(book2);
        System.out.println("Da them " + Book.getCountBooks() + " quyen sach");

        lib.addBook(book1);
        lib.addBook(book2);

        lib.showBooks();

        System.out.println("Tong so sach da them: " + lib.getCountBooksLib());
    }
    

}
