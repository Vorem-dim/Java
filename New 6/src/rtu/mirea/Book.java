package rtu.mirea;

public class Book implements Printable {
    private String name;
    public Book(String name) {
        this.name = name;
    }

    @Override
    public void Print() {
        System.out.println("Name of the book is \"" + name + "\"");
    }
}
