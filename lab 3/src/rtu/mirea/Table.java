package rtu.mirea;

public class Table extends FurnitureShop {
    private int count;
    public Table(String furniture, String material, int cost, int count) {
        super(furniture, material, cost);
        this.count = count;
    }
    public void Print() {
        super.Print();
        System.out.println("Count: " + count);
    }
}
