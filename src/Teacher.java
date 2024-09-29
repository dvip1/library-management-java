package src;

public class Teacher extends Member {

    public Teacher(String name, String email) {
        super(name, email);
        maxLength = 10;
        bookNum = 0;
        books = new Book[this.maxLength];
    }

    @Override
    public void getInfo() {
        System.out.println("Teachers Information: ");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("MemberId: " + getMemberId());
    }

}
