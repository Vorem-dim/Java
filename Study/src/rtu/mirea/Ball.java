package rtu.mirea;

public class Ball {
    private String colour;
    public Ball(String colour) {
        this.colour = colour;
    }
    public Ball() {
        this.colour = "Green";
    }
    public String toString() {
        return "The ball is " + colour;
    }
}
