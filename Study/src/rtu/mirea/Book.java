package rtu.mirea;

public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public Book() {
        this.name = "Harry Potter";
    }
    public String toString() {
        return "The name of book " + name;
    }
}
