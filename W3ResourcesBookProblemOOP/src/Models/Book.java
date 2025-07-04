package Models;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private String ISBN;
    private int borrowCount;
    private static int totalBooksCreated;
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.borrowCount = 0;
        totalBooksCreated++;
    }

    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }
    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (ISBN: " + ISBN + ")";
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void borrow() {
        this.borrowCount +=1;
    }

    public boolean equalsByAuthorAndTitle(Book otherBook) {
        if (otherBook==null) return false;
        return this.ISBN.equalsIgnoreCase(String.valueOf(otherBook.getBorrowCount()));
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareToIgnoreCase(otherBook.getTitle());
    }
}
