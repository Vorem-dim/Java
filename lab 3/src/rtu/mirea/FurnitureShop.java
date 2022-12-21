package rtu.mirea;

public abstract class FurnitureShop {
    private String furniture, material;
    private int cost;
    public FurnitureShop(String furniture, String material, int cost) {
        this.furniture = furniture;
        this.material = material;
        this.cost = cost;
    }
    public int getCost() { return cost; }
    public String getMaterial() { return material; }
    public String getFurniture() { return furniture; }
    public void Print() {
        System.out.println("Furniture is " + getFurniture() + ". It\'s made from " + getMaterial() + ". It cost " + getCost());
    }
}
