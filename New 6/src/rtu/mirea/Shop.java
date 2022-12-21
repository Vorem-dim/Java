package rtu.mirea;

public class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void Print() {
        System.out.println("Name of the shop is \"" + name + "\"");
    }
}
