package rtu.mirea;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1.toString());
        b1.move(30, 15);
        System.out.println(b1.toString());
    }
}
