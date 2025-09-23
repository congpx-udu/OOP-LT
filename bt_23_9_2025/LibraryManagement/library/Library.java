package library;

import book.Book;
import java.util.*;

public class Library {
    List<Book> books;
    public static int countBooklib;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book a) {
        books.add(a);
        countBooklib ++;
    }

    public void showBooks() {
        System.out.println("Danh sach sach trong thu vien");
        for (Book a: books) {
            a.display();
        }
    }

    public int getCountBooksLib() {
        return countBooklib;
    }

}
