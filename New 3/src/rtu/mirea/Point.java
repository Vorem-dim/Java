package rtu.mirea;

public class Point {
    private int cordx, cordy;
    public Point() {
        cordx = (int)((Math.random()*101) - 50);
        cordy = (int)((Math.random()*101) - 50);
    }
}
