package rtu.mirea;

public class TestFurniture {
    public static void main(String[] args) {
        Chair chair = new Chair("chair", "wood", 1500, 15);
        Table table1 = new Table("table", "wood", 4500, 25);
        Table table2 = new Table("table", "glass", 5000, 30);
        chair.Print();
        table1.Print();
        table2.Print();
    }
}
