package src;

public class Student extends Member {

    public Student(String name, String email) {
        super(name, email);
        maxLength = 5;
        bookNum = 0;
        books = new Book[this.maxLength];
    }

    @Override
    public void getInfo() {
        System.out.println("Student Information: ");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("MemberId: " + getMemberId());
    }

    
}
