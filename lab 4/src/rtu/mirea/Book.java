package rtu.mirea;

public class Book implements Priceable {
    private int price;
    public Book(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
