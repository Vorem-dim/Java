package rtu.mirea;

public class Square extends Rectangle{
    protected double side;
    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public Square(String colour, boolean filled, double side) {
        this.colour = colour;
        this.filled = filled;
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }
    public String toString() {
        return "Side of square is " + side;
    }
}
