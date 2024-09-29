import src.Student;
import src.Book;

class App {

    public static void main(String[] args) {
        Student Rakesh = new Student("Dvip Patel", "dvipel96@gmail.com");
        Book book1 = new Book("Book 1", "Dvip Patel");

        Rakesh.borrowBook(book1);
        System.out.println("Is the Book Available: " + book1.isAvailable());
        Rakesh.returnBook(book1);
        System.out.println("Is the Book Available now: " + book1.isAvailable());
    }
}
