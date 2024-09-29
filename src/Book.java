package src;

import java.util.Random;

public class Book {

    private String title;
    private String author;
    private int bookId;
    private boolean bookState = true;
    private static final Random rand = new Random();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookId = rand.nextInt(1000000);
    }

    public boolean isAvailable() {
        return this.bookState;
    }

    public void borrowBook() {
        if (bookState) {
            this.bookState = false;
            System.out.println(this.title + " has been Borrowed");
        } else
            System.out.println(this.title + " Book is not Available");
    }

    public void returnBook() {
        this.bookState = true;
    }

    public int getBookId() {
        return this.bookId;
    }

    public void showDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("BookId: " + this.bookId);
    }
}
