package rtu.mirea;

public class Chair extends FurnitureShop {
    private int count;
    public Chair(String furniture, String material, int cost, int count) {
        super(furniture, material, cost);
        this.count = count;
    }
    public void Print() {
        super.Print();
        System.out.println("Count: " + count);
    }
}
