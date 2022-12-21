package rtu.mirea;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Tom and Jerry");
        Book book2 = new Book();
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
