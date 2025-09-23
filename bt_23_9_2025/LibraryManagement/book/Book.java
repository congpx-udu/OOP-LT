package book;
public class Book {
    private String title;
    private String author;
    private int year;

    public static int count = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

        count ++;
    }

    public void display() {
        System.out.println("Title: " + title + ", author: " + author + ", year: " + year);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static int getCountBooks() {
        return count;
    }
}
