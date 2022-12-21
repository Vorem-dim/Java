package rtu.mirea;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        System.out.println("Cord of point: ( " + x + ", " + y + " )");
        return "";
    }

    @Override
    public void moveUp(int temp) {
        y -= temp;
        ySpeed = temp;
    }

    @Override
    public void moveDown(int temp) {
        y += temp;
        ySpeed = temp;
    }

    @Override
    public void moveLeft(int temp) {
        x -= temp;
        xSpeed = temp;
    }

    @Override
    public void moveRight(int temp) {
        x += temp;
        xSpeed = temp;
    }
}
