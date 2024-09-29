package src;

import java.util.Random;

abstract class Member {

    private String name;
    private String email;
    private int memberId;
    private static Random rand = new Random();
    protected int maxLength;
    protected int bookNum;
    protected Book[] books;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.memberId = rand.nextInt(10000);
    }

    abstract void getInfo();

    public void borrowBook(Book content) {
        if (this.bookNum >= this.maxLength - 1)
            System.out.println("BorrowBook: Max amount of Books borrowed");
        else if (!content.isAvailable())
            System.out.println("BorrowBook: Book is not Available");
        else {
            System.out.println("BorrowBook: Attempting to borrow book...");
            content.borrowBook();
            books[this.bookNum] = content;
            this.bookNum++;
            System.out.println("BorrowBook: Book borrowed successfully!");
        }
    }

    public void returnBook(Book content) {
        int cur = content.getBookId();
        for (int i = 0; i < this.bookNum; i++) {
            if (books[i].getBookId() == cur) {
                Book temp = books[bookNum - 1];
                books[i] = temp;
                books[bookNum - 1] = null;
                bookNum--;
                content.returnBook();
                System.out.println("ReturnBook: Book returned succesfully");
                return;
            }
        }
        System.out.println("ReturnBook: Book not found");
    }

    protected int getMemberId() {
        return this.memberId;
    }

    protected String getEmail() {
        return this.email;
    }

    protected String getName() {
        return this.name;
    }

}
