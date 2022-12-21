package rtu.mirea;

public class TestPrice {
    public static void main(String[] args) {
        Priceable book = new Book(150);
        System.out.println("The price of book " + book.getPrice());
    }
}
